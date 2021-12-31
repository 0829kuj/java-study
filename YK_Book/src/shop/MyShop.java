package shop;

import java.util.ArrayList;
import java.util.Scanner;

import book.BestBook;
import book.Book;
import book.EssayBook;
import book.NovelBook;

public class MyShop {
	// 서점이름
	String title;
	
	private ArrayList<User> users = new ArrayList<>();

	Book[] bestBooks = new Book[3]; 
	Book[] novelBooks = new Book[3]; 
	Book[] essayBooks = new Book[3]; 
	
	// 구매상품을 추가할 장바구니
	ArrayList<Book> cart = new ArrayList<Book>();
	
	// 고객이 고른 상품 번호
	int bookNo;
	
	// 스캐너 객체
	Scanner scan = new Scanner(System.in);
	
	// 상품 총 금액
	int total = 0;
	int point;
	
	String id = null;
	String password;

	/**
	 * 서점이름 지정(메인함수에서 매개변수로 받아옴)
	 * */
	public void setTitle(String title) {
		this.title = title;
	}
	
//	public void genUsers(String id, String pwd, int point) {
//		users.add(new User(id, pwd, point));
//		System.out.println();
//	}
	
	/**
	 * 적립금 적립 메서드
	 * */
	private void savePoint(int point) {
		if (id == null) {
			// id가 null값이면 포인트적립을 실행하지 않음
		} else {
			// 0번째 users값을 재설정함
			users.set(0, new User(id, password, point));
//			users.add(new User(id, password, point));
		}
	}
	
	
	/**
	 * 서점을 맨 처음 시작할 때 기본으로 출력되는 메뉴
	 * */ 
	public void initMenu() {
		System.out.println("");
		System.out.println(" ==================");
		System.out.println("|      " + title + "      |");
		System.out.println(" ==================");
		System.out.println("# 로그인 하시겠습니까? ( y / n )");
		System.out.printf("# 입력 : ");
		
		String isLogin = scan.nextLine();
		
		switch (isLogin) {
			case "y":
				loginMenu();
				break;
			case "n":
				System.out.println("비회원 주문시 혜택이 제한될 수 있습니다.");
				mainMenu();
				break;
			default:
				System.out.println("# y와 n중 값을 다시 입력해주세요.\n");
				initMenu();
				break;
		}
	}
	
	
	/**
	 * 회원가입과 로그인 중 선택
	 * */
	public void loginMenu() {
		System.out.println("");
		System.out.println("# 처음 방문하시는 고객께서는 회원가입을 먼저 진행해주세요.");
		System.out.println("# 원하시는 메뉴의 번호를 입력해주세요.");
		System.out.println("# 1. 로그인");
		System.out.println("# 2. 회원가입");
		System.out.println("# 0. 첫 화면으로");
		System.out.println("---------------");
		System.out.printf("# 입력 : ");
		
		int loginNum = Integer.parseInt(scan.nextLine());	// 문자열형으로 정보를 받은 후 int형으로 형변환
		
		switch (loginNum) {
		case 1:
			loginPage();
			break;
		case 2:
			accountPage();
			break;
		case 0:
			initMenu();
		break;
		default:
			System.out.println("입력오류. 다시 입력해주세요.\n");
			loginMenu();
			break;
		}
	}
	
	
	/**
	 * 회원가입 페이지
	 * */
	public void accountPage() {
		// 우선 회원가입부터
		
		System.out.println("\n"+"===========회원가입===========");
		
		id = nullTest(1);
        password = nullTest(2);

        System.out.println("회원가입을 축하합니다. 메인메뉴로 진입합니다.");
        users.add(new User(id, password, 0));
        
        mainMenu();
		
	}
	
	
	/**
	 * 가입한 id로 로그인
	 */
	public void loginPage() {
		
		id = nullTest(1);
        password = nullTest(3);

        boolean isExist = false;
        for (User each : users) {
            String eachId = each.getId();
            String eachPassword = each.getPwd();
            int eachPoint = each.getSavePoint();

            if (id.equals(eachId) && password.equals(eachPassword)) {
                System.out.println("조회하신 계정의 정보를 표기합니다.");
                System.out.printf("id : %s, 비밀번호 : %s, 적릭금 : %d", eachId, eachPassword, eachPoint);
                System.out.println();
                isExist = true;
                mainMenu();
                break;
            }
        }

        if (!isExist) {
            System.out.println("id 혹은 비밀번호가 틀렸습니다.");
            initMenu();
        }
	}
	

	/**
	 * 입력받은 id, 비밀번호의 공백 확인
	 * */
	private String nullTest(int test) {
		String input = null;
		
		switch (test) {
		case 1:
			while (true) {
                System.out.println("id를 입력하세요:");
                input = scan.nextLine();

                if (input.trim().isEmpty()) {
                    System.out.println("id는 공백을 허용하지 않습니다.");
                } else {
                    break;
                }
            }
			break;
		case 2:
            while (true) {
                System.out.println("비밀번호를 입력하세요:");
                input = scan.nextLine();

                System.out.println("비밀번호 확인을 입력하세요:");
                String passwordCheck = scan.nextLine();

                if (input.trim().isEmpty() || passwordCheck.trim().isEmpty()) {
                    System.out.println("비밀번호 또는 비밀번호 확인이 공백입니다.");
                } else if (!input.equals(passwordCheck)) {
                    System.out.println("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
                } else {
                    break;
                }
            }
            break;
        case 3:
            while (true) {
                System.out.println("비밀번호를 입력하세요: ");
                input = scan.nextLine();

                if (input.trim().isEmpty()) {
                    System.out.println("비밀번호가 공백입니다.");
                } else {
                    break;
                }
            }
            break;
		}
		return input;
	}
	
	
	/**
	 * 로그인 선택 후 출력할 메인 메뉴
	 * */
	public void mainMenu() {
		System.out.printf("\n\n");
		System.out.println("# 1. 서점으로 가기");
		System.out.println("# 2. 내 정보 확인");
		System.out.println("# 3. 장바구니");
		System.out.println("# 0. 나가기");
		System.out.println("---------------");
		System.out.printf("# 입력 : ");
		
		int menuNum = Integer.parseInt(scan.nextLine());	// 문자열형으로 정보를 받은 후 int형으로 형변환
		
		switch (menuNum) {
			case 1:
				selectCategory();
				break;
			case 2:
				myPage();
				break;
			case 3:
				printCart();
				break;
			case 0:
				System.out.println("\n" + "프로그램을 종료합니다.");
				break;
			default:
				System.out.println("입력오류. 다시 입력해주세요.\n");
				mainMenu();
				break;
		}
 	}
	
	/**
	 * 내정보 확인
	 * */
    private void myPage() {		
    	
        System.out.println("\n"+"===========마이 페이지===========");
        System.out.println("# 개인정보 접근 전 한번 더 비밀번호를 확인합니다.");

        String password = nullTest(3);

        boolean isExist = false;
        for (User each : users) {
            String eachId = each.getId();
            String eachPassword = each.getPwd();
            int eachPoint = each.getSavePoint();

            if (password.equals(eachPassword)) {
                System.out.println("\n" + "조회하신 계정의 정보를 표기합니다.");
                System.out.printf("id : %s, 비밀번호 : %s, 적릭금 : %d", eachId, eachPassword, eachPoint);
                System.out.println();
                isExist = true;
                mainMenu();
                break;
            }
        }

        if (!isExist) {
            System.out.println("id 혹은 비밀번호가 틀렸습니다.");
            initMenu();
        }
    }


	/**
	 * 카테고리별 책 리스트 생성
	 * */
	public void genBook() {
		// 배열명[index] = new 클래스명(카테고리명, 책이름, 작가명, 출판사, 가격, 적립금)
		bestBooks[0] = new BestBook("베스트셀러", "불편한 편의점", "김호연", "나무옆의자", 12600, 650);
		bestBooks[1] = new BestBook("베스트셀러", "트랜드 코리아 2022", "김난도", "미래의 창", 16200, 810);
		bestBooks[2] = new BestBook("베스트셀러", "소크라테스 익스프레스", "에릭 와이너", "어크로스", 16200, 810);
		
		novelBooks[0] = new NovelBook("소설", "미드나잇 라이브러리", "매트 헤이그", "인플루엔션", 14220, 711); 
		novelBooks[1] = new NovelBook("소설", "소설 정관정요", "나채훈", "행복한시간", 25200, 1260); 
		novelBooks[2] = new NovelBook("소설", "달러구트 꿈 백화점", "이미애", "팩토리나인", 12345, 123);
		
		essayBooks[0] = new EssayBook("비소설", "나는 죽을 때까지 재미있게 살고싶다", "이근후", "갤리온", 12600, 630);
		essayBooks[1] = new EssayBook("비소설", "바보교과서 2", "강민수", "참솔", 12600, 650);
		essayBooks[2] = new EssayBook("비소설", "상대적이며 절대적인 지식의 백과사전", "베르나르 베르베르", "열린책들", 16020, 801);
	}
	
	
	/**
	 * 서점 책 장르카테고리 선택
	 * */
	private void selectCategory() {
		System.out.printf("\n\n");
		System.out.println("=====카테고리 목록=====");
		System.out.println("|   1. 베스트 셀러    |");
		System.out.println("|   2. 소설         |");
		System.out.println("|   3. 비소설        |");		
		System.out.println("|   4. 장바구니로 가기  |");
		System.out.println("|   0. 메인메뉴로     |");
		System.out.println("===================");
		System.out.printf("# 입력 : ");
		
		int categoryNum = Integer.parseInt(scan.nextLine());
		
		printBookList(categoryNum);
	}
	/**
	 * 각 카테고리에 맞는 상품출력
	 * */
	public void printBookList(int categoryNum) {
		switch (categoryNum) {
		case 0:
			mainMenu();
			break;
		case 1:
			selectBookList(bestBooks);
			break;
		case 2:
			selectBookList(novelBooks);
			break;
		case 3:
			selectBookList(essayBooks);
			break;
		case 4:
			printCart();
			break;
		default:
			System.out.println("입력오류. 메인메뉴로 돌아갑니다.");
			mainMenu();
			break;
		}
	}
	
	
	/**
	 * 카테고리 해당 번호당 상품 목록 출력 혹은 장바구니 선택
	 * */
	private void selectBookList(Book[] books) {
		System.out.printf("\n\n");
		System.out.println("===============================================================================");
		
		System.out.println("# "+books[0].getCategoryName() + " 장르의 책을 츌력합니다. 원하는 상품번호을 입력하세요." + "\n");
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("# "+(i+1)+"번 책이름: %s, 저자: %s, 출판사: %s 가격: %d, 적립금: %d\n",
					books[i].getBookName(), books[i].getWriter(), books[i].getPublisher(), books[i].getPrice(), books[i].getPoint());
		}
		System.out.println("# 0. 메인메뉴로");
		System.out.println("===============================================================================");
		System.out.printf("# 입력 : ");
		
		int bookNum = Integer.parseInt(scan.nextLine());
		
		if (bookNum == 0) {
			mainMenu(); 	// 0 입력시 메인메뉴로
		} else if (bookNum == 1 || bookNum == 2 || bookNum == 3) {
			inCart(books[bookNum-1]);	// 1, 2, 3 중 하나 입력시 각 인덱스값을 가지고 장바구니로
		} else {
			System.out.println("\n"+"입력오류. 카테고리 선택으로 돌아갑니다.");
			selectCategory();	// 지정된 번호 외 입력시 카테고리선택으로 돌아감
		}
		
		
		
	}
	
	/**
	 * 장바구니에 상품넣기
	 * */
	private void inCart(Book book) {
		// 장바구니 리스트 작성필요
		
		cart.add(book);			// ArrayList cart에 선택한 제품을 넣는다
		total += book.getPrice();	// 총금액
		point += book.getPoint();	// 총 적립포인트
		
		// 아래 셋은 확인용. 완성 시 삭제.
//		System.out.println(cart);
//		System.out.println(total);
//		System.out.println(point);
		
		selectCategory(); 	// 상품을 넣은 뒤 카테고리 선택으로 이동
			
	}
	

	/**
	 * 장바구니 출력
	 * */
	private void printCart() {
		
		if (total == 0) {
			// 총액이 0이면 메인메뉴로
			System.out.println("# 장바구니가 비어있습니다.");
			System.out.println("# 0. 메인메뉴로");
			int cartNum = Integer.parseInt(scan.nextLine());
			switch (cartNum) {
			case 0:
				mainMenu();
				break;

			default:
				System.out.println("\n" + "잘못된 값이 입력되었습니다.");
				printCart();
				break;
			}
			
		} else {
			
			System.out.println("\n"+"==========장바구니 목록==========");
			System.out.println("번호\t   상품명\t\t     			 가격\t   적립금");
			
			for (int i = 0; i < cart.size(); i++) {
				
				System.out.printf(" %d   |\t%s   \t\t|%d\t   %d\n",i + 1 ,cart.get(i).getBookName(), cart.get(i).getPrice(), cart.get(i).getPoint());
			}
			System.out.println("");
			System.out.println("# 총 금액: " + total);
			System.out.println("# 예상 적립금: " + point);
			System.out.println("=============================");
			System.out.println("# 1. 계산하기");
			System.out.println("# 0. 카테고리 선택으로");
			System.out.println("---------------------");
			System.out.printf("# 입력 : ");
			
			int cartNum = Integer.parseInt(scan.nextLine());
			
			switch (cartNum) {
			case 1:
				checkOut();
				break;
			case 0:
				selectCategory();
				break;
			default:
				System.out.println("입력오류. 메인메뉴로 돌아갑니다.");
				mainMenu();
				break;
			}
		}
	}//--printCart()
	

	/**
	 * 장바구니 계산
	 * */
	private void checkOut() {
		System.out.printf("\n# 결제하실 금액은 %d원, 예상 적립금은 %d포인트 입니다. 결제방법을 선택하세요.\n", total, point);
		System.out.println("# 1. 현금");
		System.out.println("# 2. 카드");
		System.out.printf("# 입력 : ");
		
		int payNum = Integer.parseInt(scan.nextLine());
		
		switch (payNum) {
		case 1:
			payCash(); break;
		case 2:
			
			payCard(); break;
		default:
			System.out.println("# 잘못된 값이 입력되었습니다.");
			checkOut();
			break;
		}
	}
	
	/**
	 * 카드로 계산
	 * */
	private void payCard() {
		System.out.println("\n"+"=============================");
		System.out.println("# 카드결제를 선택하셨습니다.");
		System.out.println("# 영수증을 받으시겠습니까? ( y / n )");
		System.out.printf("# 입력 : ");
		
		String printReceipt = scan.nextLine();
		
		switch (printReceipt) {
			case "y":
				System.out.println("# 영수증이 발행되었습니다.");
				exitMenu();
				break;
			case "n":
				exitMenu();
				break;
			default:
				System.out.println("# y와 n중 값을 다시 입력해주세요.\n");
				payCard();
				break;
		}
	}

	/**
	 * 현금으로 계산
	 * */
	private void payCash() {
		System.out.println("\n"+"=============================");
		System.out.println("# 현금결제를 선택하셨습니다.");
		System.out.println("# 지불하실 금액은 " + total + "원 입니다.");
		System.out.printf("# 입력 : ");
		
		int cash = Integer.parseInt(scan.nextLine());
		
		if (cash >= total) {
			System.out.println("\n"+"=============================");
			System.out.printf("# %d원을 지불하셨습니다. 거스름돈은 %d원 입니다. \n", cash, cash - total);
			exitMenu();
			
		}else {
			System.out.println("\n"+"=============================");
			System.out.printf("# %d원을 더 지불하셔야합니다. \n", total - cash);
			differenceCash(cash);
		}
		
		
	}

	private void differenceCash(int cash) {
		System.out.println("# 현금 차액을 지불합니다.");
		
		int diff = Integer.parseInt(scan.nextLine());
		
		if (diff == total - cash) {
			System.out.println("\n"+"=====================================");
			exitMenu();
		} else if (diff < total - cash) {
			
			total = (total - cash) - diff; 
			
			System.out.println("\n"+"=====================================");
			System.out.printf("# %d원을 더 지불하셔야 합니다.\n", total);
			
			differenceCash(total);
		} else {
			System.out.println("\n"+"=====================================");
			System.out.printf("# %d원을 지불하셨습니다. 거스름돈은 %d원 입니다.\n", diff , diff - (total - cash));
			exitMenu();
		}	
	}
	
	/**
	 * id와 적립금현황 출력, 나가는 인삿말 
	 * */
	private void exitMenu() {
		System.out.println("");
		savePoint(point);
		System.out.println(users.toString());
		System.out.println("# 계산이 완료되었습니다. 안녕히 가세요.");
		System.out.println("# 프로그램을 종료합니다.");
	}

	
}

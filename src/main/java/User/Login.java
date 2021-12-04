package User;

import Main.Main;
import Util.UserInput;

public class Login {

    public static void login() {

        int cnt = 0;
        System.out.println("========= 로그인 ==========");

        while(true){

            String id= UserInput.simple("ID : ");
            String password =UserInput.simple("PW : ");

            try{
                if(UserDateSet.userList.get(id).getPassword().equals(password)) {
                    System.out.println("로그인 하였습니다.");
                    break;
                }
                else {
                    System.out.println("비밀번호가 다릅니다.");
                    cnt++;
                }
                throw new Exception(); //강제 에러 출력
            }
            catch (Exception e){
                if(!UserDateSet.userList.containsKey(id)) {
                    System.out.println("없는 계정입니다. 회원 가입으로 전환합니다.");
                    Register.register();
                }
            }
            finally{
                if(cnt ==3) {//카운터 값을 줘 3번 실패시 회원가입 창으로 넘어가게 했다.
                    System.out.println("로그인을 3회 실패했습니다. 처음부터 다시 진행해 주세요.");
                    Main.login();
                    return;
                }

            }
        }


    }


}
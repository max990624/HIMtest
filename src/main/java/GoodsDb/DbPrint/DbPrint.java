package GoodsDb.DbPrint;

import Util.UserInput;
import GoodsDb.DbPrint.DbPrinter;

public class DbPrint {
    String userSel;
    DbPrinter dbPrinter = new DbPrinter();
    public void print() {
        System.out.println("\n <물품 출력 기능에 들어오셨습니다.> \n");

        userSel = UserInput.selTwo("물품 출력을 어떻게 하시겠습니까? (전체 출력 = 1, 부분 출력 = 2 입력) :");
        if (userSel == "1")
            dbPrinter.allGoodsPrint();
        userSel = UserInput.selFour("어떤 부분을 출력하시겠습니까? (식료품 = 1, 비식료품 = 2, 자동구매 식료품 = 3, 자동구매 비식료품 = 4 입력) :");
        switch (userSel){
            case "1" :
                dbPrinter.eatGoodsPrint();
                break;
            case "2" :
                dbPrinter.notEatGoodsPrint();
                break;
            case "3" :
                dbPrinter.autoEatGoodsPrint();
                break;
            case "4" :
                dbPrinter.autoNotEatGoodsPrint();
                break;
        }
        //메인으로 가면됨

    }
}

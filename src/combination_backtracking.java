public class combination_backtracking{

        public static void main(String[] args) {
            int n = 4;
            int tq= 2;
            boolean [] board =  new boolean[n] ;
            per(board ,tq," " ,0,0) ;
        }

        public static void per(boolean[]board,int tq,String ans ,int qpsf,int indx)
        {
            if (qpsf==tq){
                System.out.println(ans);
                return;}

            for(int i = indx; i < board.length ; i++) {
                if (board[i] == false) {
                    board[i] =true;
                    per(board,tq,ans+"b"+i+"q"+qpsf,qpsf+1,i+1);
                    board[i]= false;
                }


            }
        }
    }//backtracking permutaion






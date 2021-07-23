package mainclasses;

public class Sort {
    
    //Sort by Enemy Health from the biggest to the smallest with Selection Sort
    //Nama  : Ricky
    //NIM   : 03082200012
    public Enemy[] selectionSort(Enemy[] enemy){
        Enemy sortedEnemyList[] = enemy;

        for(int i = 0 ; i < sortedEnemyList.length ; i++){
            for (int j = i + 1 ; j <= sortedEnemyList.length-1 ; j++){
                if(sortedEnemyList[i].getHealth() < sortedEnemyList[j].getHealth()){
                    Enemy tampungan = sortedEnemyList[i];
                    sortedEnemyList[i] = sortedEnemyList[j];
                    sortedEnemyList[j] = tampungan;
                }
            }
        }
        return sortedEnemyList;
    }

    //Sort by Player Health from the biggest to the smallest with Selection Sort (Method Overloading)
    //Nama  : Ricky
    //NIM   : 03082200012
    public Player[] selectionSort(Player[] player){
        Player sortedPlayerList[] = player;
        for(int i = 0 ; i < sortedPlayerList.length ; i++){
            for (int j = i + 1 ; j <= sortedPlayerList.length-1 ; j++){
                if(sortedPlayerList[i].getClassOriginalHealth() < sortedPlayerList[j].getClassOriginalHealth()){
                    Player tampungan = sortedPlayerList[i];
                    sortedPlayerList[i] = sortedPlayerList[j];
                    sortedPlayerList[j] = tampungan;
                }
            }
        }
        return sortedPlayerList;
    }


    //Sort Player Health from largest to smallest with bubble sort
    /*
    Nama : Richard Hanitio
    NIM : 03082200014
    */

    public Player[] bubbleSort(Player[] listPlayer){
        Player[] sortedPlayerList = listPlayer;
        for (int k=0; k<sortedPlayerList.length-1; k++){
            for(int i=0; i<sortedPlayerList.length-1; i++){
                if(sortedPlayerList[i].getClassOriginalHealth() < sortedPlayerList[i+1].getClassOriginalHealth()){
                    Player temp = sortedPlayerList[i];
                    sortedPlayerList[i] = sortedPlayerList[i+1];
                    sortedPlayerList[i+1] = temp;
                }
            }
        }
        return sortedPlayerList;
    }

    //Sort Enemy Health from smallest to largest with shell sort
    /*
    Nama : Calvin Wendy
    NIM : 03082200010
    */
    public Enemy[] shellSort(Enemy[] enemy) {
        int n = enemy.length;
        Enemy[] musuh = enemy;
    
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Enemy key = musuh[i];
                int j = i;
                while (j >= gap && musuh[j - gap].getHealth() > key.getHealth()) {
                    musuh[j] = musuh[j - gap];
                    j -= gap;
                }
                musuh[j] = key;
            }
        }
        return musuh;
    }
}

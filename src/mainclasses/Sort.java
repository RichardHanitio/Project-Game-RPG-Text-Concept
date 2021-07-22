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
}

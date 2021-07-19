package mainclasses;

public class Sort {
    
    //Sort by Enemy Health from the biggest to the smallest
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
}

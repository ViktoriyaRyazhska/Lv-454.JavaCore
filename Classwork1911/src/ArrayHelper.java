        public class ArrayHelper
        {
        public static void main(String[] args) {
            ArrayHelper arrayHelper = new ArrayHelper();
            int[] myArray = arrayHelper.createArray();
            arrayHelper.print(myArray);
        }
            public void print(int[] myArray){
                for(int i=0; i< myArray.length; i++){
                    System.out.print( myArray[i] + ", ");
                }
                System.out.println(" ");
                System.out.println("The biggest number is " + getMax(myArray));
                System.out.println("The sum of positive numbers in array " + getSumPositiveNumbers(myArray));
                System.out.println("The amount of negative numbers in array " + amountOfNegativeNumbers(myArray));
                comparePositiveNegative(myArray);
            }

            public int[] createArray(){
                int[] array ={10,-2,-5,57,100,3,0,-6,1,95};
                return array;
            }
            public int getMax(int[] arr) {
                int max = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                } return max;
            }
            public int getSumPositiveNumbers(int[]arr) {
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > 0) {
                        sum += arr[i];
                    }
                } return sum;
            }
            public int amountOfNegativeNumbers(int[]arr){
                int amountNegative = 0;
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i]<0){
                        amountNegative++;
                    }
                }return(amountNegative);
        }
                public int amountOfPositiveNumbers(int[]arr){
                   int amountPositive = 0;
                    for (int i = 0; i <arr.length; i++) {
                        if (arr[i]>0){
                            amountPositive++;
                        }
                    } return amountPositive;

                }
                public void comparePositiveNegative(int[]arr){

                    if (amountOfNegativeNumbers(arr) > (amountOfPositiveNumbers(arr))) {
                        System.out.println("The value negative numbers are more then positive ");
                    } else {
                        System.out.println("The value positive numbers are more then negative ");
                    }

                }
        }







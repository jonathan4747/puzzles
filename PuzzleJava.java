import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava{
    public static ArrayList<Integer>  getTenRolls( ){
        ArrayList<Integer> arreglo = new ArrayList<Integer>();
        Random randMachine = new Random();
        for(int i = 1 ; i<=10 ; i++){
            int aleatorio= randMachine.nextInt(20);
            arreglo.add( aleatorio);
        }
        return arreglo;
    }
    public static char getRandomLetter (){
        char arreglo [] =new char[26];
        Random randMachine = new Random();
        int numero = randMachine.nextInt(25);
        for (int i = 0 ; i<26 ; i++){
            arreglo[i]= (char)('a'+i) ;
        }
        char letra = arreglo[numero];
        return letra;
    }

    public static char[] generatePassword (){
        char arreglo [] =new char[26];
        Random randMachine = new Random();
        char  password[] = new char[8];
        for (int i = 0 ; i<26 ; i++){
            arreglo[i]= (char)('a'+i) ;
        }
        for(int i = 0 ; i<8 ; i++){
            password[i]= arreglo[randMachine.nextInt(25)];    
        }
        return password;
    }

    public static ArrayList<String> getNewPasswordSet( int numero){
        ArrayList<String> array = new ArrayList<String>();
        char arreglo [] =new char[26];
        Random randMachine = new Random();
        char  password[] = new char[8];
        for (int i = 0 ; i<26 ; i++){
            arreglo[i]= (char)('a'+i) ;
        }
        for(int i = 1; i <=numero ; i++ ){
            for(int j = 0 ; j<8 ; j++){
                password[j]= arreglo[randMachine.nextInt(25)];    
            }
            String contrase = String.valueOf(password);
            array.add(contrase); 
        }  
        return array;
    }

}
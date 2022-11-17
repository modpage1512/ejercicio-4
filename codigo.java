public class MyClass {
    public static void main(String args[]) {
        
        int numeroIf = 0;
        int numeroWhile = 0;
      
       if(numeroIf == 0){
          System.out.println("es cero");
       } else if(numeroIf > 0){
          System.out.println(" es mayor que cero");
       }else{
           System.out.println("es menor que cero");
           
       }
       
       while(numeroWhile < 3){
        numeroWhile++;
        System.out.println(numeroWhile);
       }
       
       do{
        numeroWhile++;
        System.out.println(numeroWhile);
       }while(numeroWhile < 3);
       
       for(int numeroFor = 0; numeroFor < 3; numeroFor++){
        System.out.println(numeroFor);
       }
       
       String estacion = "invierno";
       
       switch(estacion){
        case "invierno":
         System.out.println(estacion);
         break;
        case "primavera":
         System.out.println(estacion);
         break;
         case "otoño":
         System.out.println(estacion);
         break;
         case "verano":
         System.out.println(estacion);
         break;
         default: 
         System.out.println("no hay estacion");
         break;
       }
       
      }
}
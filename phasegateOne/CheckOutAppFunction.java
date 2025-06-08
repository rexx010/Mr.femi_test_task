public class CheckOutAppFunction{

//int addUp = 

public static String[] named(String customerName,  String cashierName){
String[] names = new String[2];
names[0] = customerName;
names[1] = cashierName;
return names;
}

public static String[][] productBox(String item, int pieces, int price){

String[][] product = {{null, null, null, null},{null, null, null, null},{null, null, null}, null};

int total = pieces * price;
for(int count = 0; count < product.length; count++){
	for(int counter = 0; counter < product.length; counter++){
		if(product[count] == null){
		product[count][counter] = item;
		product[count][counter] = Integer.toString(pieces);
		product[count][counter] = Integer.toString(price);
		product[count][counter] = Integer.toString(total);
		}
	}
}
return product;
}

/*public static int calculations(String item, int pieces, int price, int discount){



}*/










}
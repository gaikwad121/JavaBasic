package Java_prog;

public class Snippet {
	public static void main(String []args) {
		checkOddEven();
		printOddNum();
		CountOdd();
		EvenNum();
		EvenSum();
		revNum();
		PalindromNum();
		CountNum();
		armstrongNum();
		sumOfDigit();
		swap();
		swapWithOutThird();
		swapWithOutThird2();
	}
	static void checkOddEven(){
	int num=13;
	if(num%2==0){
	System.out.println("Even");
	}else{
	System.out.println("Odd");
	}}
	// print odd number from 1 to 10
	static void printOddNum(){
	int num=90;
	for(int i=1;i<=num;i++){
	if(i%2!=0){
		System.out.println(i);
	}
	}}
	// Count odd number from 1 to 100
	static void CountOdd() {
	int num=100;
	int count=0;
	for(int i=1;i<=num;i++) {
	if(i%2!=0) {
		count++;
	}
	}
	System.out.println(count);
	
}

// count even number
static void EvenNum() {
	int num=90;
	int count=0;
	for(int i=1;i<=num;i++) {
		if(i%2==0) {
			count++;
		}
	}
	System.out.println(count);
}
// Even sum from 1 to 90
static void EvenSum() {
	int num=90;
	int sum=0;
	for(int i=1;i<=num;i++) {
		if(i%2==0) {
			sum+=i;
		}
	}
	System.out.println(sum);
}
// Reverse the number
static void revNum() {
	int num=123456789;
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10;
		num/=10;
	}
	System.out.println(rev);
}
// Palindrom Number
static void PalindromNum() {
	int num=12121;
	int rev=0;
	int temp=num;
	while(num!=0) {
		rev=rev*10+num%10;
		num/=10;
	}
	if(temp==rev) {
		System.out.println("The num is palindrom");
	}else {
		System.out.println("The num is not palindrom");
	}
}
static void CountNum() {
// Count Num of digit
int count=0;
int num=12345678;
while(num!=0) {
	count++;
	num/=10;
}
System.out.println(count);
}

// Check ArmStrong number or not
static void armstrongNum() {
	int num=153;
	int arm=0;
	int temp=num;
	while(num!=0) {
	int n=num%10;
	arm=arm+(n*n*n);
	num/=10;
	}
	if(temp==arm) {
		System.out.println("The num is armstrong num");
	}else {
		System.out.println("The num is not armstrong num");
	}
}
// Sum of digit
static void sumOfDigit() {
	int num=129876453;
	int sum=0;
	while(num!=0) {
	int n=num%10;
	sum+=n;
	num/=10;
	}
	System.out.println(sum);
}

// swap two num with 3rd num
static void swap() {
int a=67;
int b=89;
System.out.println("before swap"+" "+a+" "+b);
int temp=a;
a=b;
b=temp;
System.out.println("After swap"+" "+a+" "+b);

}
// swap two num without 3rd
static void swapWithOutThird() {
	int a=13;
	int b=46;
	System.out.println("before swap"+" "+a+" "+b);
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("After swap"+" "+a+" "+b);
}
static void swapWithOutThird2(){
	int a=77;
	int b=91;
	System.out.println("before swap"+" "+a+" "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swap"+" "+a+" "+b);	
}
}








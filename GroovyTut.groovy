class GroovyTut{

  def GroovyTut(myField) {
    this.myField = myField;
  }

  def myField;
static main(args) {
  println("Hello world");

    //closure example
  def getFactorial = {num -> (num<= 1
  ? 1 
  : num * call(num - 1)
  )}
  println "getFactorial(4): ${getFactorial(4)}";

  //iterate over list using closure
  def numList = [1,2,3,4,5];
  numList.each {println(it)};

    // more each and derefenecing key values

  //not sure what data types these are... a list of tuples?
  def employees = [
    'mike': 33,
    'bob': 34,
    'alice': 36,
  ];

    employees.each {println("$it.key : $it.value");}

}

  def myMethod(){
    println("hi")
  }







  
}

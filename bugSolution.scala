```scala
import scala.math.Numeric

class MyClass[T : Numeric](val value: T) {
  def myMethod(other: MyClass[T])(implicit num: Numeric[T]): T = {
    num.plus(value, other.value)
  }
}

val instance1 = new MyClass(10)
val instance2 = new MyClass(20)

println(instance1.myMethod(instance2))

val instance3 = new MyClass("hello") //this will not compile
val instance4 = new MyClass(10.5)
val instance5 = new MyClass(20.5)
println(instance4.myMethod(instance5))
```
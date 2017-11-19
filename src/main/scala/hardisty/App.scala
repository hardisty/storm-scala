package hardisty



/**
 * @author ${user.name}
 */
object App {
  import org.apache.storm.LocalCluster
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    var cluster:LocalCluster = new LocalCluster()
    //println("made a Storm cluster")
    //cluster.shutdown()
    //println("shut Storm cluster down")
    println("concat arguments = " + foo(args))
  }

}

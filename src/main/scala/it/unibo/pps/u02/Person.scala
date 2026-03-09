enum Person:
  case Student(name: String, year: Int)
  case Teacher(name: String, course: String)

object Person {
  def name(person: Person): String = person match
    case Student(name, year) => name
    case Teacher(name, course) => name

  def isTeacher(person: Person): Boolean = person match {
    case Teacher(_, _) => true
    case _ => false
  }
}

@main
def main(): Unit =
  import Person.*
  val myself = Teacher("Gianluca Aguzzi", "PPS")
  println(isTeacher(myself))
package spatutorial.shared

trait Api {
  // message of the day
  def welcomeMsg(name: String): String

  // get Todo items
  def getAllTodos(): Seq[TodoItem]

  // update a Todo
  def updateTodo(item: TodoItem): Seq[TodoItem]

  // delete a Todo
  def deleteTodo(itemId: String): Seq[TodoItem]




  def createChapter(chapter: Chapter)

  def retrieveAllChapters: Seq[Chapter]

  def updateChapter(chapter: Chapter): Seq[Chapter]

  def deleteChapter(id: String): Seq[Chapter]
}

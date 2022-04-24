package zhang

class ExistUpper {
  def existUpper(text:String):Boolean={
    return text.exists(_.isUpper)
  }
}

package zhang

object BitOperator {
  def main(args: Array[String]): Unit = {
    1 & 2 // 0:Int 按位与
    1 | 2 // 3:Int 按位或
    1 ^ 3 // 2:Int 按位异或
    ~1 // -2:Int 对操作元每一位取反

    -1 >> 31 // -1:Int 右移
    -1 >>> 31 // 1:Int 无符号右移
    1 << 2 // 4:Int 左移
  }
}

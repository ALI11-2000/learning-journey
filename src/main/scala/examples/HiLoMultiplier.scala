// See LICENSE.txt for license details.
// January 22nd, 2018	- adapted to Learning Journey

package examples

import Chisel._

//A 4-bit adder with carry in and carry out
class HiLoMultiplier() extends Module { 
  val io = new Bundle { 
    val A  = UInt(INPUT, 16) 
    val B  = UInt(INPUT, 16) 
    val Hi = UInt(OUTPUT, 16) 
    val Lo = UInt(OUTPUT, 16) 
  } 
  val mult = io.A * io.B 
  io.Lo := mult(15, 0) 
  io.Hi := mult(31, 16) 
}

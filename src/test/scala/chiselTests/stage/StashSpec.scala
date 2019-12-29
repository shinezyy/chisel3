// See LICENSE for license details.

package chiselTests.stage

import chisel3._
import chisel3.incremental.Stash
import chisel3.stage.phases.Elaborate
import chisel3.stage.{ChiselCircuitAnnotation, ChiselGeneratorAnnotation}
import firrtl.options.Phase
import org.scalatest.{FlatSpec, Matchers}


/*
class ChiselStageSpec extends FlatSpec with Matchers {

  class Bar(barOpt: Option[Bar]) extends MultiIOModule {
    val in = IO(Input(UInt(3.W)))
    val out = IO(Output(UInt(3.W)))
    val handles = if(barOpt.nonEmpty) {
      val bar = InstanceHandle("var", barOpt.get)
      Seq(bar)
    } else Nil
    if(barOpt.nonEmpty) {
      handles(0) { bar =>
        bar.in := in
        out := bar.out
      }
    } else {
      out := in
    }
  }

  behavior of classOf[Stash].toString

  class Fixture { val phase: Phase = new Elaborate }

  it should "export a cache after elaboration" in new Fixture {
    val annotations = Seq( ChiselGeneratorAnnotation(() => new Foo),
      ChiselGeneratorAnnotation(() => new Bar) )
    val out = phase.transform(annotations)

    info("original annotations removed")
    out.collect{ case a: ChiselGeneratorAnnotation => a } should be (empty)

    info("circuits created with the expected names")
    out.collect{ case a: ChiselCircuitAnnotation => a.circuit.name } should be (Seq("Foo", "Bar"))
  }

}

 */

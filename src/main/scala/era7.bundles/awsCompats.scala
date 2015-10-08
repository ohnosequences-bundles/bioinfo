package era7.bundles

import ohnosequences.statika._, bundles._
import ohnosequences.statika.aws._, api._, amazonLinuxAMIs._
import ohnosequences.awstools.regions.Region._

case object awsCompats {

  abstract class CompatibleFor[B <: AnyBundle](bundle: B) extends Compatible(
    amzn_ami_64bit(Ireland, Virtualization.HVM)(1),
    bundle,
    generated.metadata.Bundles
  )

  case object velvet    extends CompatibleFor(std.velvet)
  case object samtools  extends CompatibleFor(std.samtools)
  case object bowtie2   extends CompatibleFor(std.bowtie2)
  case object tophat    extends CompatibleFor(std.tophat)
  case object cufflinks extends CompatibleFor(std.cufflinks)

  // case object oasesCompat extends Compatible(
  //   amzn_ami_64bit(Ireland, Virtualization.HVM)(1),
  //   std.oases,
  //   generated.metadata.Bundles
  // )
  //
  // case object prinseqCompat extends Compatible(
  //   amzn_ami_64bit(Ireland, Virtualization.HVM)(1),
  //   std.prinseq,
  //   generated.metadata.Bundles
  // )
  //
  // case object blastCompat extends Compatible(
  //   amzn_ami_64bit(Ireland, Virtualization.HVM)(1),
  //   std.blast,
  //   generated.metadata.Bundles
  // )

}

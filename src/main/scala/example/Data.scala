package example

import scala.language.higherKinds

import doobie.imports._
import io.circe._
import generic.semiauto._

case class Data(i: Int, s: String)

object Data {

  private[example] def loadQuery(i: Int): Query0[Data] = sql"""select i, s from data where i = $i""".query[Data]

  def load[M[_]](i: Int)(implicit xa: Transactor[M]): M[Data] = loadQuery(i).unique.transact(xa)

  implicit val encoder: Encoder[Data] = deriveEncoder[Data]

  implicit val decoder: Decoder[Data] = deriveDecoder[Data]

}
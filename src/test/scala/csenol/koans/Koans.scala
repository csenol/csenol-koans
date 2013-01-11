package csenol.koans

import org.scalatest._
import support.Master

class Koans extends Suite {
  override def nestedSuites = List(
    new Csenol1Classes,
    new Csenol2Functions,
    new Csenol3Fors,
    new Csenol4ValVarDef,
    new Csenol5Controls
  )

  override def run(testName: Option[String], reporter: Reporter, stopper: Stopper, filter: Filter,
                   configMap: Map[String, Any], distributor: Option[Distributor], tracker: Tracker) {
    super.run(testName, reporter, Master, filter, configMap, distributor, tracker)
  }

}

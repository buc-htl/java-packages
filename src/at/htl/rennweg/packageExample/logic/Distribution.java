/**
 * Packages werden in Java verwendet um Klassen in Gruppen zusammenzufassen.
 * Das "package" Statement steht als erstes Statement in der Datei legt fest zu welchem Package eine Klasse gehört.
 *
 * Der Package-Name entspricht auch der Ordnerstruktur im Dateisystem.
 *
 * package sew2; -> Alle Klassen dieses Packages befinden sich in einem Ordner namens "sew2"
 *
 * Es können mehrere Ordner verschachtelt werden. Im Package-Namen werden diese durch Punkte getrennt.
 *
 * package sew2.ue2; -> Alle Klassen dieses Packages liegen in einem Ordner ue2, der sich im Ordner sew2 befindet.
 *
 * Wenn man sein Programm öffentlich machen möchte, ist es wichtig, dass Package-Namen eindeutig sind und kein(e) anderer(e)
 * Programmierer*in die gleichen Package-Namen verwendet. Es hat sich in der Java-Welt eingebürgert dafür die eigene umgedrehte
 * Domain zu verwenden. Unsere Schule besitzt die Domain htl.rennweg.at. Wenn wir unsere Programme öffentlich machen, beginnen alle
 * unsere Packages mit at.rennweg.htl. Damit müssten wir nur mehr intern in der Schule sicher stellen, dass dann keiner die gleichen
 * Packete verwendet :)
 */

package at.htl.rennweg.packageExample.logic;    //legt fest zu welchem Package diese Klasse gehört


/** Mit dem import statement kann man einzelne Klassen oder ganze Packages importieren.
 *  Klassen, die sich im gleichen Package befinden, brauchen nicht importiert werden.
 * **/

/** Dieses Statement importiert die Klasse Bruch **/
import at.htl.rennweg.packageExample.helper.Bruch;

/** setzt man einen * am Ende werden alle Klassen aus diesem Package importiert **/
import at.htl.rennweg.packageExample.entities.*;



/** Auch Java stellt uns viele Klassen zu Verfügung, die bei Bedarf importiert werden können, z.B. die Klasse Arrays **/
import java.util.Arrays;

public class Distribution {

    public static void main(String[] args) {

        /** Klassen aus einem anderen package müssen importiert werden - siehe import statement **/
        Bottle[] bottle = new Bottle[3];
        Box box = new Box();

        Bruch bruch = new Bruch();

        //funktioniert nicht, weil die Klasse distance nicht importiert wurde
        //Importiere die Klasse!
        Distance d = new Distance();

    }


}

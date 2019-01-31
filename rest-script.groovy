import java.awt.BorderLayout as BL
import javax.swing.WindowConstants as WC
import groovy.swing.SwingBuilder
import javax.swing.ImageIcon
def base = 'https://developers.google.com/chart/'
def params = [cht:'p3',chs:'250x100',
              chd:'t:60,40',chl:'Hello|World']
String qs = params.collect { k,v -> "$k=$v" }.join('&')
SwingBuilder.edt {
    frame(title:'Hello, Chart!', pack: true,
visible:true, defaultCloseOperation:WC.EXIT_ON_CLOSE) {
    label(icon:new ImageIcon("$base$qs".toURL()),
        constraints:BL.CENTER)
}

}

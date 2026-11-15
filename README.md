# WlItem

**Author:** Bryce Campbell

**Description:** A port of a [rust crate](https://github.com/bryceac/wlitem) to help deal with wishlist items that have notes attached.

**Version:** 0.1.0

## Notes

This library has been test with Java 25, but **should** be backwards compatible with 21.

### Version History

<dl>
  <dt style="font-weight:bold">0.1</dt>
  <dd>Initial release. Released Nov. 14, 2026</dd>
</dl>

### Questions

<ol>
<li>
<dl>
<dt style="font-weight:bold">This seems to only provide a type and I/O stuff. Why create this library?</dt>
<dd>
<p>After moving to Linux, I wanted to get back into GUI programming, but even though I have been mainly programming in Rust these days, GUI was a pain to detail with in the two languages I have the most experience with.</p>
<p>As such, I decided to give Java another chance, but I was having issues getting the main formats to be support well and decided to make a library in Kotlin.</p>
</dd>
<dt style="font-weight:bold">Does this work on Android?</dt>
<dd>
<p>After the headache that I dealt with in <a href="https://github.com/bryceac/BCheckbook-Android">another project</a>, I do not have any interest in dealing with Android.</p>
<p>However, since this library uses a lot of stuff found wherever Kotlin can be deployed, such as UUID stuff and things found in a default Java development environment, there <strong>should</strong> be no reason this cannot work on Android.</p>
<p>Just be aware that I don't plan too support it.</p>
</dd>
</dl>
</li>
</ol>

### Usage

To create an item, all you should need to do is the following:

<pre>
import me.brycecampbell.wlitem.Item

fun main(args: Array<String>) {
    var item = Item()
}
</pre>

This creates an empty item ready to populate.

If you want to save items to a file, you would do something like this:

<pre>
import me.brycecampbell.*

fun main(args: Array<String>) {
    var items = mutableListOf(
            Item("7746C39C-D951-4E03-840C-8E91AF0B6D1D", "Nintendo Switch 2", 1, "high", "https://example.com/nintendo_switch_2"),
            Item("BBDF7A43-C38B-4943-93A0-BDD6B47A2685", "Mario Kart World", 1, "high", "https://example.com/nintendo_switch_2/mario-kart"),
            Item("6AA6A21C-F22D-40A5-AE1A-D7E2B4F87724", "Dragon Quest 7", 1, "low", "https://example.com/nintendo_switch_2/dragon-quest")
        )

    items.saveToJSON("items.json")
}
</pre>

If you want to export to TSV, you use **saveToTSV** instead.

These methods **should** be available in Java too, and would be done like this:

<pre>
saveToJSON.saveToJSON(items, "items.json")
</pre>

Unlike the Kotlin variants, the Java form requires more typing because these methods are part of extensions to a mutable list type.

### Contributing

If you would like to contribute to this project and make it better, feel free to fork this repo and make a pull request.

Submissions are to be licensed under the same terms as this project.

### Support

If you need help, feel free to contact me at the address below:

tonyhawk2100@gmail.com

While I am more experienced with Rust and Swift these days, I will try my best to help you.
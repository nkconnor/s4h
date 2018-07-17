# Scala 4 Humans

I was tired of constantly looking up the syntax for various Scala methods, e.g. list operations:

*before*
 ```
item +: list  # prepend
list :+ item  # append
list ++ list  # append
```

*after*

```
import com.nconnor.s4h._

list.prepend(item)  # prepend
list.append(item)   # append
list.append(list)   # append
```

This will get pushed to Maven Central whenever useful.
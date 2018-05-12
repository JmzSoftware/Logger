# Logger Library

#### Add to your project build.gradle

<pre>allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}</pre>

#### Add to your app build.gradle

<pre>implementation 'com.github.JmzSoftware:Logger:-SNAPSHOT'</pre>

#### Add to MainActivity
<pre>Logger.init(this);</pre>

#### Examples
<pre>
error("This is an error");
verbose("This is verbose log");
info("This is info log");
out("This is out log");
</pre>

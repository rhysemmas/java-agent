# java-agent

Creating Java agents.

## Fibonacci

### Agent
* Add maven jar plugin to project
* Create MANIFEST.MF
* Add manifest to pom.xml build
* Enable install after build in Maven lifecycle

### App
* Load the agent by editing VM options to include `-javaagent:` followed by the path to the `./target` directory of the simple static agent

### Resources

* Getting started (Fibonacci example): https://stackify.com/what-are-java-agents-and-how-to-profile-with-them/
* Beginner's guide (Byte Buddy): https://www.javaadvent.com/2019/12/a-beginners-guide-to-java-agents.html
* Definitive guide: https://www.youtube.com/watch?v=cwYkoJWZj_w
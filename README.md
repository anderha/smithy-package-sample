# Sample project: Failing to resolve smithy traits
Reference https://github.com/disneystreaming/smithy4s/issues/420

## Manual
- Check out the repository and open the project with your IDE
- `cd modules/api-definition`
- `sbt publishLocal`
- `cd ../..`
- `sbt compile` should output
    ```
    [error] software.amazon.smithy.model.validation.ValidatedResultException: Result contained ERROR severity validation events:
    [error] [ERROR] anderha.smithy.package.sample.api#HealthAPIController: Unable to resolve trait `smithy4s.api#simpleRestJson`. If this is a custom trait, then it must be defined before it can be used in a model. | Model jar:file:/Users/anderha/.ivy2/local/anderha.smithy-package-sample/api-definition_2.13/0.0.1/jars/api-definition_2.13.jar!/META-INF/smithy/healthAPIController.smithy:5:16
    [error]         at software.amazon.smithy.model.validation.ValidatedResult.validate(ValidatedResult.java:145)
    [error]         at software.amazon.smithy.model.validation.ValidatedResult.unwrap(ValidatedResult.java:132)
    [error]         at smithy4s.codegen.ModelLoader$.$anonfun$load$1(ModelLoader.scala:59)
    [error]         at scala.Option.foreach(Option.scala:407)
    [error]         at smithy4s.codegen.ModelLoader$.load(ModelLoader.scala:54)
    [error]         at smithy4s.codegen.Codegen$.processSpecs(Codegen.scala:36)
    [error]         at smithy4s.codegen.Smithy4sCodegenPlugin$.$anonfun$cachedSmithyCodegen$5(Smithy4sCodegenPlugin.scala:169)
    [error]         at sbt.util.Tracked$.$anonfun$lastOutput$1(Tracked.scala:73)
    [error]         at scala.Function$.$anonfun$untupled$1(Function.scala:110)
    [error]         at sbt.util.Tracked$.$anonfun$inputChangedW$1(Tracked.scala:219)
    [error]         at smithy4s.codegen.Smithy4sCodegenPlugin$.$anonfun$cachedSmithyCodegen$1(Smithy4sCodegenPlugin.scala:182)
    [error]         at scala.Function1.$anonfun$compose$1(Function1.scala:49)
    [error]         at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:62)
    [error]         at sbt.std.Transform$$anon$4.work(Transform.scala:68)
    [error]         at sbt.Execute.$anonfun$submit$2(Execute.scala:282)
    [error]         at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:23)
    [error]         at sbt.Execute.work(Execute.scala:291)
    [error]         at sbt.Execute.$anonfun$submit$1(Execute.scala:282)
    [error]         at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:265)
    [error]         at sbt.CompletionService$$anon$2.call(CompletionService.scala:64)
    [error]         at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
    [error]         at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
    [error]         at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
    [error]         at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
    [error]         at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
    [error]         at java.base/java.lang.Thread.run(Thread.java:829)
    [error] (Compile / smithy4sCodegen) software.amazon.smithy.model.validation.ValidatedResultException: Result contained ERROR severity validation events:
    [error] [ERROR] anderha.smithy.package.sample.api#HealthAPIController: Unable to resolve trait `smithy4s.api#simpleRestJson`. If this is a custom trait, then it must be defined before it can be used in a model. | Model jar:file:/Users/anderha/.ivy2/local/anderha.smithy-package-sample/api-definition_2.13/0.0.1/jars/api-definition_2.13.jar!/META-INF/smithy/healthAPIController.smithy:5:16
    ```

namespace anderha.api

use smithy4s.api#simpleRestJson

@simpleRestJson
service HealthAPIController {
    version: "1.0.0",
    operations: [ping]
}

@http(method: "GET", uri: "/", code: 200)
@readonly
operation ping {}
# CoAP

## CoAP request
This advanced action allows you to send CoAP requests from [NeoLoad](https://www.neotys.com/neoload/overview)

| Property | Value |
| -----| -------------- |
| Maturity | Experimental |
| Author   | Neotys Partner Team |
| License  | [BSD Simplified](https://www.neotys.com/documents/legal/bsd-neotys.txt) |
| NeoLoad  | 6.1 (Enterprise or Professional Edition w/ Integration & Advanced Usage and NeoLoad Web option required)|
| Requirements | NeoLoad Web SaaS subscription |
| Bundled in NeoLoad | No
| Download Binaries | See the [latest release](https://github.com/ttheol/CoAP/releases/latest)

## Installation

1. Download the [latest release](https://github.com/ttheol/CoAP/releases/latest)
1. Read the NeoLoad documentation to see [How to install a custom Advanced Action](https://www.neotys.com/documents/doc/neoload/latest/en/html/#25928.htm)

## Usage

1. Read the NeoLoad documentation to see [How to use an Advanced action](https://www.neotys.com/documents/doc/neoload/latest/en/html/#25929.htm)

## Parameters
| Name             | Description |
| -----            | ----- |
| Method | Method to use to send the request to the server. Possible value are **GET**, **POST**, **PUT**, **DELETE** |
| Server | address of the CoAP server |
| Port | Port of the CoAP endpoint |
| Path (optional) |Path to the URI without the first / |
| Confirmable (optional) | Set to **true** or **false**. <br> If true, request is confirmable. If false, request is non-confirmable. |
| Payload (optional) | Send a payload along a POST or PUT request |
| Token (optional) | Specifies a token for the request |
| If-None-Match (optional) | Adds the If-None-Match header in a PUT request. No value needs to be specified |
| If-Match (optional) | Adds an If-Match header in a PUT request. Value needs to be an hex etag without the 0x |
| Etag (optional) | Adds an etag to the request. Value needs to be in hex format without the 0x |

You can also add any parameter with any name and value. NeoLoad will concatenate them in the path for a GET, and in the payload for a POST or PUT.

## Status Codes
* NL-CoAPClient-01 : No response from the CoAP server

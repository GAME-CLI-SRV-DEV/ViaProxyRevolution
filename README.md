# 비아프록시레볼루션
강제 퇴장 메시지를 Java 계정에 사용하고
ViaProxy 서버 주소로 서버를 변경하는 플러그인입니다.
Java Edition 유저가 베드락 에디션 전용 Geyser 서버의 geyserblockjavaplayers.bypass를 우회하는데 사용될 수 있습니다.

# 스피곳에서 설치
TransferProxyRevolution-Spigot파일을 받아야합니다.
# 사용법
ViaProxy 공용 서버 주소는 다음과 같이 이루어져 있습니다.

서버아이피주소_서버포트_서버버전.viaproxy.프록시아이피주소(도메인이 아닌 경우 그 주소 옆에 sslip(IPv6),nip(IPv4).io를 붙여 만듬)

이 주소를 구성해야 합니다.

1. /viaproxy conf 프록시아이피:프록시포트을 입력하세요. 연결되는 주소입니다.
2. /viaproxy 서버주소 서버포트 서버버전을 입력하세요. 구문 사이에 밑줄이 그어지면서 .viaproxy. 가 서버주소_서버포트_서버버전과 프록시아이피:프록시포트에 붙습니다. 그 주소가 서버주소 칸에 적은 주소에 연결하는데 사용됩니다.
3. 응답을 받았습니다, 인증 응답이 뜨면 인증합니다.
4. 서버가 접속되었습니다.

시연
1. viaproxy conf anarchyconnect.duckdns.org:53587
2. viaproxy endzone.me 19132 bedrock-1.21.3
3. endzone.me_19132_Bedrock-1.21.3.viaproxy.anarchyconnect.duckdns.org:53587 반환하고 연결
4. 연결 응답을 받음: 코드를 받았습니다. 베드락 계정: ejrn0384
5. aka.ms/remoteconnect에 코드 입력
6. endzone.me로 연결됨

# ViaProxyRevolution
a Kickscreen Revolution Plugin of ViaProxy & SpigotMC.
Makes Java edition Users connect to Bedrock-Only Geyser Server without gaining permission geyserblockjavaplayers.bypass.

# How to
The ViaProxy must be configured.

1. type /viaproxy conf [hostname]:[hostport]. this becomes a part of viaproxy.hostname. this is a target viaproxy address.
2. type /viaproxy address port version. this will transfer you to address_port_version.viaproxy.hostname with authentication
3. get a response. if it's auth response, input a code from the authresponse, and then try it again.

on a ViaProxy Side, install the authenticationhandler plugin to make sure it uses the whole thing of viaproxy otherwise it will not work.

it uses the kickscreen for the Authentication so you have to do full login everytime. 

also, the viaproxy backend address server(address_port_version) must be on 1.7 to run this on viaproxy!

> [!Warning]
> ViaProxyRevolution-AuthenticationHandler is a temporary solution so it would be discontinued if ViaProxy adds web authentication or same thing. (eventhough that isn't gonna happen because of there is no users using that because ViaProxy Is Easier to use.)

# how does this work?
### Transfer to ViaProxy
Uses TransferProxy API.
### AuthHandler
uses ViaProxy as a compileonly, this trick causes this plugin use viaproxy and gains access to minecraftauth.


# FAQ
Are You Going to support VIAaaS Soon?
sorry, VIAaaS is Not Yet Supporting the PluginAPI yet.

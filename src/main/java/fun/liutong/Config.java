package fun.liutong;

/**
 * @ClassName: Config
 * @Description: 固定配置
 * @Author: 刘通
 * @Date: 2020/1/29 15:21
 * @Version: 1.0
 */
public class Config {
    public static final String UserAgent = "Mozilla/5.0 (Linux; Android 11; V2118A Build/RP1A.200720.012; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/86.0.4240.99 XWEB/3171 MMWEBSDK/20210601 Mobile Safari/537.36 MMWEBID/6783 MicroMessenger/8.0.7.1920(0x28000737) Process/toolsmp WeChat/arm64 Weixin NetType/4G Language/zh_CN ABI/arm64";
    public static final String indexUrl = "https://wechat.laixuanzuo.com/index.php/reserve/index.html?f=wechat";
    public static final String Referer = "https://wechat.laixuanzuo.com/index.php/reserve/index.html?f=wechat";
    public static final String URL_JS = "https://static\\.wechat\\.laixuanzuo\\.com/template/theme2/cache/layout/\\w+\\.js";
    public static final String DOMAIN = "wechat.laixuanzuo.com";
    public static final String JS = "function getCode(jsonStr,decStr){var _=\"0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz\",f={0:0,1:1,2:2,3:3,4:4,5:5,6:6,7:7,8:8,9:9,A:10,B:11,C:12,D:13,E:14,F:15,G:16,H:17,I:18,J:19,K:20,L:21,M:22,N:23,O:24,P:25,Q:26,R:27,S:28,T:29,U:30,V:31,W:32,X:33,Y:34,Z:35,a:36,b:37,c:38,d:39,e:40,f:41,g:42,h:43,i:44,j:45,k:46,l:47,m:48,n:49,o:50,p:51,q:52,r:53,s:54,t:55,u:56,v:57,w:58,x:59,y:60,z:61};Hexch=function(t){if(t.length<57){throw new Error(\"the key is too short.\")}this._sz=_.charCodeAt(t[15])%(t.length-20)+10,this._ks=t.slice(-this._sz);for(var r=0;r<this._sz;++r){this._ks[r]=_.charCodeAt(this._ks[r]%62)}this._k16=[],this._k41=[],this._t16={},this._t41={};for(r=0;r<16;++r){this._k16[r]=_.charAt(t[r]),this._t16[this._k16[r]]=r}for(r=0;r<41;++r){this._k41[r]=_.charAt(t[r+16]),this._t41[this._k41[r]]=r}},Hexch.prototype.dec=function(t){for(var r=this._t16,h=this._t41,e=this._ks,s=this._sz,i=0,o=t.replace(/[0-9A-Za-z]/g,function(t){return _.charAt((f[t]-e[i++%s]%62+62)%62)}),c=\"\",a=0;a<o.length;){var n=o.charAt(a);/[\\s\\n\\r]/.test(n)?(c+=n,++a):void 0!==r[n]?(c+=String.fromCharCode(16*r[o.charAt(a)]+r[o.charAt(a+1)]),a+=2):(c+=String.fromCharCode(1681*h[o.charAt(a)]+41*h[o.charAt(a+1)]+h[o.charAt(a+2)]),a+=3)}return c},reserve_seat=function(){var r=JSON.parse(jsonStr),s=new Hexch(r);return s.dec(decStr)};return reserve_seat()};";

}

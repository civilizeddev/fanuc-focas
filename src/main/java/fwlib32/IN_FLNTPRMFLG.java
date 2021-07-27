package fwlib32;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IN_FLNTPRMFLG extends Structure {
	public byte OwnIpAddress;
	public byte NodeName;
	public byte Area1CmnMemAddr;
	public byte Area1CmnMemSize;
	public byte Area2CmnMemAddr;
	public byte Area2CmnMemSize;
	public byte TokenWatch;
	public byte MinFrame;
	public byte OwnStatus;
	public byte EntryNode;
	public byte Area1PmcAddr;
	public byte Area1ExchgAddr;
	public byte Area1ExchgSize;
	public byte Area2PmcAddr;
	public byte Area2ExchgAddr;
	public byte Area2ExchgSize;
	public byte Area2PmcDoAddr;
	public byte Area2ExchgDoSize;
	public byte Area2PmcDiAddr;
	public byte Area2ConditionAddr;
	public byte Area2AlterAddr;
	public byte Area2ExchgDiAddr;
	public byte Area2ExchgDiSize;
	public byte ClientMsgAddr;
	public byte ClientMsgSize;
	public byte ServerMsgAddr;
	public byte ServerMsgSize;
	public byte Option1;
	public byte Option2;
	public IN_FLNTPRMFLG() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("OwnIpAddress", "NodeName", "Area1CmnMemAddr", "Area1CmnMemSize", "Area2CmnMemAddr", "Area2CmnMemSize", "TokenWatch", "MinFrame", "OwnStatus", "EntryNode", "Area1PmcAddr", "Area1ExchgAddr", "Area1ExchgSize", "Area2PmcAddr", "Area2ExchgAddr", "Area2ExchgSize", "Area2PmcDoAddr", "Area2ExchgDoSize", "Area2PmcDiAddr", "Area2ConditionAddr", "Area2AlterAddr", "Area2ExchgDiAddr", "Area2ExchgDiSize", "ClientMsgAddr", "ClientMsgSize", "ServerMsgAddr", "ServerMsgSize", "Option1", "Option2");
	}
	public IN_FLNTPRMFLG(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IN_FLNTPRMFLG implements Structure.ByReference {
		
	};
	public static class ByValue extends IN_FLNTPRMFLG implements Structure.ByValue {
		
	};
}

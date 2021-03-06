package fwlib32;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class T_BUS_PARA extends Structure {
	public byte fdl_add;
	public byte baud_rate;
	public short tsl;
	public short min_tsdr;
	public short max_tsdr;
	public byte tqui;
	public byte tset;
	public NativeLong ttr;
	public byte g;
	public byte hsa;
	public byte max_retry_limit;
	public byte bp_flag;
	public short min_slave_interval;
	public short poll_timeout;
	public short data_control_time;
	public byte[] reserved = new byte[6];
	public byte[] master_class2_name = new byte[32];
	public T_MAS_USR mas_usr;
	public T_BUS_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("fdl_add", "baud_rate", "tsl", "min_tsdr", "max_tsdr", "tqui", "tset", "ttr", "g", "hsa", "max_retry_limit", "bp_flag", "min_slave_interval", "poll_timeout", "data_control_time", "reserved", "master_class2_name", "mas_usr");
	}
	public T_BUS_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends T_BUS_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends T_BUS_PARA implements Structure.ByValue {
		
	};
}

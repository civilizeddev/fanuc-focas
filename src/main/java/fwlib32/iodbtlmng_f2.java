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
public class iodbtlmng_f2 extends Structure {
	public NativeLong T_code;
	public NativeLong life_count;
	public NativeLong max_life;
	public NativeLong rest_life;
	public byte life_stat;
	public byte cust_bits;
	public short tool_info;
	public short H_code;
	public short D_code;
	public NativeLong spindle_speed;
	public NativeLong feedrate;
	public short magazine;
	public short pot;
	public short G_code;
	public short W_code;
	public short gno;
	public short grp;
	public short edge;
	public short org_magazine;
	public short org_pot;
	public byte edge_num;
	public byte reserve_c;
	public NativeLong[] reserved = new NativeLong[2];
	public NativeLong custom1;
	public NativeLong custom2;
	public NativeLong custom3;
	public NativeLong custom4;
	public NativeLong custom5;
	public NativeLong custom6;
	public NativeLong custom7;
	public NativeLong custom8;
	public NativeLong custom9;
	public NativeLong custom10;
	public NativeLong custom11;
	public NativeLong custom12;
	public NativeLong custom13;
	public NativeLong custom14;
	public NativeLong custom15;
	public NativeLong custom16;
	public NativeLong custom17;
	public NativeLong custom18;
	public NativeLong custom19;
	public NativeLong custom20;
	public NativeLong custom21;
	public NativeLong custom22;
	public NativeLong custom23;
	public NativeLong custom24;
	public NativeLong custom25;
	public NativeLong custom26;
	public NativeLong custom27;
	public NativeLong custom28;
	public NativeLong custom29;
	public NativeLong custom30;
	public NativeLong custom31;
	public NativeLong custom32;
	public NativeLong custom33;
	public NativeLong custom34;
	public NativeLong custom35;
	public NativeLong custom36;
	public NativeLong custom37;
	public NativeLong custom38;
	public NativeLong custom39;
	public NativeLong custom40;
	public iodbtlmng_f2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("T_code", "life_count", "max_life", "rest_life", "life_stat", "cust_bits", "tool_info", "H_code", "D_code", "spindle_speed", "feedrate", "magazine", "pot", "G_code", "W_code", "gno", "grp", "edge", "org_magazine", "org_pot", "edge_num", "reserve_c", "reserved", "custom1", "custom2", "custom3", "custom4", "custom5", "custom6", "custom7", "custom8", "custom9", "custom10", "custom11", "custom12", "custom13", "custom14", "custom15", "custom16", "custom17", "custom18", "custom19", "custom20", "custom21", "custom22", "custom23", "custom24", "custom25", "custom26", "custom27", "custom28", "custom29", "custom30", "custom31", "custom32", "custom33", "custom34", "custom35", "custom36", "custom37", "custom38", "custom39", "custom40");
	}
	public iodbtlmng_f2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbtlmng_f2 implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbtlmng_f2 implements Structure.ByValue {
		
	};
}

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
public class odbsysex extends Structure {
	/** maximum axis number */
	public short max_axis;
	public short max_spdl;
	public short max_path;
	public short max_mchn;
	public short ctrl_axis;
	public short ctrl_srvo;
	public short ctrl_spdl;
	public short ctrl_path;
	public short ctrl_mchn;
	/** additional information */
	public short addinfo;
	/** reserve */
	public short[] reserved = new short[2];
	public odbsysex.path_struct[] path = new odbsysex.path_struct[10];
	public static class path_struct extends Structure {
		/** M/T/TT <ascii char> */
		public short system;
		public short group;
		public short attrib;
		public short ctrl_axis;
		public short ctrl_srvo;
		public short ctrl_spdl;
		public short mchn_no;
		public short reserved;
		public path_struct() {
			super();
		}
		protected List<String> getFieldOrder() {
			return Arrays.asList("system", "group", "attrib", "ctrl_axis", "ctrl_srvo", "ctrl_spdl", "mchn_no", "reserved");
		}
		public path_struct(short system, short group, short attrib, short ctrl_axis, short ctrl_srvo, short ctrl_spdl, short mchn_no, short reserved) {
			super();
			this.system = system;
			this.group = group;
			this.attrib = attrib;
			this.ctrl_axis = ctrl_axis;
			this.ctrl_srvo = ctrl_srvo;
			this.ctrl_spdl = ctrl_spdl;
			this.mchn_no = mchn_no;
			this.reserved = reserved;
		}
		public path_struct(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends path_struct implements Structure.ByReference {
			
		};
		public static class ByValue extends path_struct implements Structure.ByValue {
			
		};
	};
	public odbsysex() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("max_axis", "max_spdl", "max_path", "max_mchn", "ctrl_axis", "ctrl_srvo", "ctrl_spdl", "ctrl_path", "ctrl_mchn", "addinfo", "reserved", "path");
	}
	public odbsysex(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsysex implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsysex implements Structure.ByValue {
		
	};
}

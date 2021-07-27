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
public class idb3dmstop extends Structure {
	public fwlib32.odbsysex.path_struct[] path = new fwlib32.odbsysex.path_struct[10];
	public static class path_struct extends Structure {
		public NativeLong plus;
		public NativeLong minus;
		public path_struct() {
			super();
		}
		protected List<String> getFieldOrder() {
			return Arrays.asList("plus", "minus");
		}
		public path_struct(NativeLong plus, NativeLong minus) {
			super();
			this.plus = plus;
			this.minus = minus;
		}
		public path_struct(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends path_struct implements Structure.ByReference {
			
		};
		public static class ByValue extends path_struct implements Structure.ByValue {
			
		};
	};
	public idb3dmstop() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("path");
	}
	public idb3dmstop(fwlib32.odbsysex.path_struct path[]) {
		super();
		if ((path.length != this.path.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.path = path;
	}
	public idb3dmstop(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends idb3dmstop implements Structure.ByReference {
		
	};
	public static class ByValue extends idb3dmstop implements Structure.ByValue {
		
	};
}

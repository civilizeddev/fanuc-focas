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
public class iodbhpac extends Structure {
	public fwlib32.iodbhppr.tune_struct[] tune = new fwlib32.iodbhppr.tune_struct[3];
	public static class tune_struct extends Structure {
		public short slct;
		public short diff;
		public short fine;
		public short acc_lv;
		public NativeLong bipl;
		public short aipl;
		public NativeLong corner;
		public NativeLong clamp;
		public NativeLong c_acc;
		public NativeLong foward;
		public NativeLong[] reserve = new NativeLong[8];
		public tune_struct() {
			super();
		}
		protected List<String> getFieldOrder() {
			return Arrays.asList("slct", "diff", "fine", "acc_lv", "bipl", "aipl", "corner", "clamp", "c_acc", "foward", "reserve");
		}
		public tune_struct(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends tune_struct implements Structure.ByReference {
			
		};
		public static class ByValue extends tune_struct implements Structure.ByValue {
			
		};
	};
	public iodbhpac() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("tune");
	}
	public iodbhpac(fwlib32.iodbhppr.tune_struct tune[]) {
		super();
		if ((tune.length != this.tune.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.tune = tune;
	}
	public iodbhpac(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbhpac implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbhpac implements Structure.ByValue {
		
	};
}

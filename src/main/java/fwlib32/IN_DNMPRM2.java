package fwlib32;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.Union;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IN_DNMPRM2 extends Structure {
	public prm_union prm;
	public static class prm_union extends Union {
		public IN_DNMPRM_BUS2 bus;
		public IN_DNMPRM_SLAVE slave;
		public prm_union() {
			super();
		}
		public prm_union(IN_DNMPRM_BUS2 bus) {
			super();
			this.bus = bus;
			setType(IN_DNMPRM_BUS2.class);
		}
		public prm_union(IN_DNMPRM_SLAVE slave) {
			super();
			this.slave = slave;
			setType(IN_DNMPRM_SLAVE.class);
		}
		public prm_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends prm_union implements Structure.ByReference {
			
		};
		public static class ByValue extends prm_union implements Structure.ByValue {
			
		};
	};
	public IN_DNMPRM2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("prm");
	}
	public IN_DNMPRM2(prm_union prm) {
		super();
		this.prm = prm;
	}
	public IN_DNMPRM2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IN_DNMPRM2 implements Structure.ByReference {
		
	};
	public static class ByValue extends IN_DNMPRM2 implements Structure.ByValue {
		
	};
}

package fwlib32;
import com.sun.jna.NativeLong;
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
public class odbdy3 extends Structure {
	public short dummy;
	/** axis number */
	public short axis;
	/** alarm status */
	public NativeLong alarm;
	/** current program number */
	public NativeLong prgnum;
	/** main program number */
	public NativeLong prgmnum;
	/** current sequence number */
	public NativeLong seqnum;
	/** actual feedrate */
	public NativeLong actf;
	/** actual spindle speed */
	public NativeLong acts;
	public pos_union pos;
	public static class pos_union extends Union {
		public faxis_struct faxis;
		public oaxis_struct oaxis;
		public static class faxis_struct extends Structure {
			/** absolute position */
			public NativeLong[] absolute = new NativeLong[32];
			/** machine position */
			public NativeLong[] machine = new NativeLong[32];
			/** relative position */
			public NativeLong[] relative = new NativeLong[32];
			/** distance to go */
			public NativeLong[] distance = new NativeLong[32];
			public faxis_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("absolute", "machine", "relative", "distance");
			}
			public faxis_struct(NativeLong absolute[], NativeLong machine[], NativeLong relative[], NativeLong distance[]) {
				super();
				if ((absolute.length != this.absolute.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.absolute = absolute;
				if ((machine.length != this.machine.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.machine = machine;
				if ((relative.length != this.relative.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.relative = relative;
				if ((distance.length != this.distance.length)) 
					throw new IllegalArgumentException("Wrong array size !");
				this.distance = distance;
			}
			public faxis_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends faxis_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends faxis_struct implements Structure.ByValue {
				
			};
		};
		public static class oaxis_struct extends Structure {
			/** absolute position */
			public NativeLong absolute;
			/** machine position */
			public NativeLong machine;
			/** relative position */
			public NativeLong relative;
			/** distance to go */
			public NativeLong distance;
			public oaxis_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("absolute", "machine", "relative", "distance");
			}
			public oaxis_struct(NativeLong absolute, NativeLong machine, NativeLong relative, NativeLong distance) {
				super();
				this.absolute = absolute;
				this.machine = machine;
				this.relative = relative;
				this.distance = distance;
			}
			public oaxis_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends oaxis_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends oaxis_struct implements Structure.ByValue {
				
			};
		};
		public pos_union() {
			super();
		}
		public pos_union(faxis_struct faxis) {
			super();
			this.faxis = faxis;
			setType(faxis_struct.class);
		}
		public pos_union(oaxis_struct oaxis) {
			super();
			this.oaxis = oaxis;
			setType(oaxis_struct.class);
		}
		public pos_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends pos_union implements Structure.ByReference {
			
		};
		public static class ByValue extends pos_union implements Structure.ByValue {
			
		};
	};
	public odbdy3() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("dummy", "axis", "alarm", "prgnum", "prgmnum", "seqnum", "actf", "acts", "pos");
	}
	public odbdy3(short dummy, short axis, NativeLong alarm, NativeLong prgnum, NativeLong prgmnum, NativeLong seqnum, NativeLong actf, NativeLong acts, pos_union pos) {
		super();
		this.dummy = dummy;
		this.axis = axis;
		this.alarm = alarm;
		this.prgnum = prgnum;
		this.prgmnum = prgmnum;
		this.seqnum = seqnum;
		this.actf = actf;
		this.acts = acts;
		this.pos = pos;
	}
	public odbdy3(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbdy3 implements Structure.ByReference {
		
	};
	public static class ByValue extends odbdy3 implements Structure.ByValue {
		
	};
}

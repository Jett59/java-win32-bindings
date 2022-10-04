// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMIDIOUTCAPSA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wMid"),
        Constants$root.C_SHORT$LAYOUT.withName("wPid"),
        Constants$root.C_LONG$LAYOUT.withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("szPname"),
        Constants$root.C_SHORT$LAYOUT.withName("wTechnology"),
        Constants$root.C_SHORT$LAYOUT.withName("wVoices"),
        Constants$root.C_SHORT$LAYOUT.withName("wNotes"),
        Constants$root.C_SHORT$LAYOUT.withName("wChannelMask"),
        Constants$root.C_LONG$LAYOUT.withName("dwSupport")
    ).withName("tagMIDIOUTCAPSA");
    public static MemoryLayout $LAYOUT() {
        return tagMIDIOUTCAPSA.$struct$LAYOUT;
    }
    static final VarHandle wMid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    public static VarHandle wMid$VH() {
        return tagMIDIOUTCAPSA.wMid$VH;
    }
    public static short wMid$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPSA.wMid$VH.get(seg);
    }
    public static void wMid$set( MemorySegment seg, short x) {
        tagMIDIOUTCAPSA.wMid$VH.set(seg, x);
    }
    public static short wMid$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPSA.wMid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMid$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPSA.wMid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
    public static VarHandle wPid$VH() {
        return tagMIDIOUTCAPSA.wPid$VH;
    }
    public static short wPid$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPSA.wPid$VH.get(seg);
    }
    public static void wPid$set( MemorySegment seg, short x) {
        tagMIDIOUTCAPSA.wPid$VH.set(seg, x);
    }
    public static short wPid$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPSA.wPid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPid$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPSA.wPid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vDriverVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vDriverVersion"));
    public static VarHandle vDriverVersion$VH() {
        return tagMIDIOUTCAPSA.vDriverVersion$VH;
    }
    public static int vDriverVersion$get(MemorySegment seg) {
        return (int)tagMIDIOUTCAPSA.vDriverVersion$VH.get(seg);
    }
    public static void vDriverVersion$set( MemorySegment seg, int x) {
        tagMIDIOUTCAPSA.vDriverVersion$VH.set(seg, x);
    }
    public static int vDriverVersion$get(MemorySegment seg, long index) {
        return (int)tagMIDIOUTCAPSA.vDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vDriverVersion$set(MemorySegment seg, long index, int x) {
        tagMIDIOUTCAPSA.vDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPname$slice(MemorySegment seg) {
        return seg.asSlice(8, 32);
    }
    static final VarHandle wTechnology$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wTechnology"));
    public static VarHandle wTechnology$VH() {
        return tagMIDIOUTCAPSA.wTechnology$VH;
    }
    public static short wTechnology$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPSA.wTechnology$VH.get(seg);
    }
    public static void wTechnology$set( MemorySegment seg, short x) {
        tagMIDIOUTCAPSA.wTechnology$VH.set(seg, x);
    }
    public static short wTechnology$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPSA.wTechnology$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wTechnology$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPSA.wTechnology$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wVoices$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wVoices"));
    public static VarHandle wVoices$VH() {
        return tagMIDIOUTCAPSA.wVoices$VH;
    }
    public static short wVoices$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPSA.wVoices$VH.get(seg);
    }
    public static void wVoices$set( MemorySegment seg, short x) {
        tagMIDIOUTCAPSA.wVoices$VH.set(seg, x);
    }
    public static short wVoices$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPSA.wVoices$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wVoices$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPSA.wVoices$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wNotes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wNotes"));
    public static VarHandle wNotes$VH() {
        return tagMIDIOUTCAPSA.wNotes$VH;
    }
    public static short wNotes$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPSA.wNotes$VH.get(seg);
    }
    public static void wNotes$set( MemorySegment seg, short x) {
        tagMIDIOUTCAPSA.wNotes$VH.set(seg, x);
    }
    public static short wNotes$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPSA.wNotes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wNotes$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPSA.wNotes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wChannelMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wChannelMask"));
    public static VarHandle wChannelMask$VH() {
        return tagMIDIOUTCAPSA.wChannelMask$VH;
    }
    public static short wChannelMask$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPSA.wChannelMask$VH.get(seg);
    }
    public static void wChannelMask$set( MemorySegment seg, short x) {
        tagMIDIOUTCAPSA.wChannelMask$VH.set(seg, x);
    }
    public static short wChannelMask$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPSA.wChannelMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wChannelMask$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPSA.wChannelMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSupport$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSupport"));
    public static VarHandle dwSupport$VH() {
        return tagMIDIOUTCAPSA.dwSupport$VH;
    }
    public static int dwSupport$get(MemorySegment seg) {
        return (int)tagMIDIOUTCAPSA.dwSupport$VH.get(seg);
    }
    public static void dwSupport$set( MemorySegment seg, int x) {
        tagMIDIOUTCAPSA.dwSupport$VH.set(seg, x);
    }
    public static int dwSupport$get(MemorySegment seg, long index) {
        return (int)tagMIDIOUTCAPSA.dwSupport$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSupport$set(MemorySegment seg, long index, int x) {
        tagMIDIOUTCAPSA.dwSupport$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}



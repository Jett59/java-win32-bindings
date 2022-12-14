// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMIDIINCAPS2A {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wMid"),
        Constants$root.C_SHORT$LAYOUT.withName("wPid"),
        Constants$root.C_LONG$LAYOUT.withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("szPname"),
        Constants$root.C_LONG$LAYOUT.withName("dwSupport"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ManufacturerGuid"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ProductGuid"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("NameGuid")
    ).withName("tagMIDIINCAPS2A");
    public static MemoryLayout $LAYOUT() {
        return tagMIDIINCAPS2A.$struct$LAYOUT;
    }
    static final VarHandle wMid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    public static VarHandle wMid$VH() {
        return tagMIDIINCAPS2A.wMid$VH;
    }
    public static short wMid$get(MemorySegment seg) {
        return (short)tagMIDIINCAPS2A.wMid$VH.get(seg);
    }
    public static void wMid$set( MemorySegment seg, short x) {
        tagMIDIINCAPS2A.wMid$VH.set(seg, x);
    }
    public static short wMid$get(MemorySegment seg, long index) {
        return (short)tagMIDIINCAPS2A.wMid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMid$set(MemorySegment seg, long index, short x) {
        tagMIDIINCAPS2A.wMid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
    public static VarHandle wPid$VH() {
        return tagMIDIINCAPS2A.wPid$VH;
    }
    public static short wPid$get(MemorySegment seg) {
        return (short)tagMIDIINCAPS2A.wPid$VH.get(seg);
    }
    public static void wPid$set( MemorySegment seg, short x) {
        tagMIDIINCAPS2A.wPid$VH.set(seg, x);
    }
    public static short wPid$get(MemorySegment seg, long index) {
        return (short)tagMIDIINCAPS2A.wPid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPid$set(MemorySegment seg, long index, short x) {
        tagMIDIINCAPS2A.wPid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vDriverVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vDriverVersion"));
    public static VarHandle vDriverVersion$VH() {
        return tagMIDIINCAPS2A.vDriverVersion$VH;
    }
    public static int vDriverVersion$get(MemorySegment seg) {
        return (int)tagMIDIINCAPS2A.vDriverVersion$VH.get(seg);
    }
    public static void vDriverVersion$set( MemorySegment seg, int x) {
        tagMIDIINCAPS2A.vDriverVersion$VH.set(seg, x);
    }
    public static int vDriverVersion$get(MemorySegment seg, long index) {
        return (int)tagMIDIINCAPS2A.vDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vDriverVersion$set(MemorySegment seg, long index, int x) {
        tagMIDIINCAPS2A.vDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPname$slice(MemorySegment seg) {
        return seg.asSlice(8, 32);
    }
    static final VarHandle dwSupport$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSupport"));
    public static VarHandle dwSupport$VH() {
        return tagMIDIINCAPS2A.dwSupport$VH;
    }
    public static int dwSupport$get(MemorySegment seg) {
        return (int)tagMIDIINCAPS2A.dwSupport$VH.get(seg);
    }
    public static void dwSupport$set( MemorySegment seg, int x) {
        tagMIDIINCAPS2A.dwSupport$VH.set(seg, x);
    }
    public static int dwSupport$get(MemorySegment seg, long index) {
        return (int)tagMIDIINCAPS2A.dwSupport$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSupport$set(MemorySegment seg, long index, int x) {
        tagMIDIINCAPS2A.dwSupport$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ManufacturerGuid$slice(MemorySegment seg) {
        return seg.asSlice(44, 16);
    }
    public static MemorySegment ProductGuid$slice(MemorySegment seg) {
        return seg.asSlice(60, 16);
    }
    public static MemorySegment NameGuid$slice(MemorySegment seg) {
        return seg.asSlice(76, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}



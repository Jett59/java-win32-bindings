// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagHARDWAREINPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("uMsg"),
        Constants$root.C_SHORT$LAYOUT.withName("wParamL"),
        Constants$root.C_SHORT$LAYOUT.withName("wParamH")
    ).withName("tagHARDWAREINPUT");
    public static MemoryLayout $LAYOUT() {
        return tagHARDWAREINPUT.$struct$LAYOUT;
    }
    static final VarHandle uMsg$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uMsg"));
    public static VarHandle uMsg$VH() {
        return tagHARDWAREINPUT.uMsg$VH;
    }
    public static int uMsg$get(MemorySegment seg) {
        return (int)tagHARDWAREINPUT.uMsg$VH.get(seg);
    }
    public static void uMsg$set( MemorySegment seg, int x) {
        tagHARDWAREINPUT.uMsg$VH.set(seg, x);
    }
    public static int uMsg$get(MemorySegment seg, long index) {
        return (int)tagHARDWAREINPUT.uMsg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uMsg$set(MemorySegment seg, long index, int x) {
        tagHARDWAREINPUT.uMsg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wParamL$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wParamL"));
    public static VarHandle wParamL$VH() {
        return tagHARDWAREINPUT.wParamL$VH;
    }
    public static short wParamL$get(MemorySegment seg) {
        return (short)tagHARDWAREINPUT.wParamL$VH.get(seg);
    }
    public static void wParamL$set( MemorySegment seg, short x) {
        tagHARDWAREINPUT.wParamL$VH.set(seg, x);
    }
    public static short wParamL$get(MemorySegment seg, long index) {
        return (short)tagHARDWAREINPUT.wParamL$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wParamL$set(MemorySegment seg, long index, short x) {
        tagHARDWAREINPUT.wParamL$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wParamH$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wParamH"));
    public static VarHandle wParamH$VH() {
        return tagHARDWAREINPUT.wParamH$VH;
    }
    public static short wParamH$get(MemorySegment seg) {
        return (short)tagHARDWAREINPUT.wParamH$VH.get(seg);
    }
    public static void wParamH$set( MemorySegment seg, short x) {
        tagHARDWAREINPUT.wParamH$VH.set(seg, x);
    }
    public static short wParamH$get(MemorySegment seg, long index) {
        return (short)tagHARDWAREINPUT.wParamH$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wParamH$set(MemorySegment seg, long index, short x) {
        tagHARDWAREINPUT.wParamH$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


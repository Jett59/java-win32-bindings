// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMCI_GETDEVCAPS_PARMS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwCallback"),
        Constants$root.C_LONG$LAYOUT.withName("dwReturn"),
        Constants$root.C_LONG$LAYOUT.withName("dwItem")
    ).withName("tagMCI_GETDEVCAPS_PARMS");
    public static MemoryLayout $LAYOUT() {
        return tagMCI_GETDEVCAPS_PARMS.$struct$LAYOUT;
    }
    static final VarHandle dwCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    public static VarHandle dwCallback$VH() {
        return tagMCI_GETDEVCAPS_PARMS.dwCallback$VH;
    }
    public static long dwCallback$get(MemorySegment seg) {
        return (long)tagMCI_GETDEVCAPS_PARMS.dwCallback$VH.get(seg);
    }
    public static void dwCallback$set( MemorySegment seg, long x) {
        tagMCI_GETDEVCAPS_PARMS.dwCallback$VH.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)tagMCI_GETDEVCAPS_PARMS.dwCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        tagMCI_GETDEVCAPS_PARMS.dwCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReturn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReturn"));
    public static VarHandle dwReturn$VH() {
        return tagMCI_GETDEVCAPS_PARMS.dwReturn$VH;
    }
    public static int dwReturn$get(MemorySegment seg) {
        return (int)tagMCI_GETDEVCAPS_PARMS.dwReturn$VH.get(seg);
    }
    public static void dwReturn$set( MemorySegment seg, int x) {
        tagMCI_GETDEVCAPS_PARMS.dwReturn$VH.set(seg, x);
    }
    public static int dwReturn$get(MemorySegment seg, long index) {
        return (int)tagMCI_GETDEVCAPS_PARMS.dwReturn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReturn$set(MemorySegment seg, long index, int x) {
        tagMCI_GETDEVCAPS_PARMS.dwReturn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwItem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwItem"));
    public static VarHandle dwItem$VH() {
        return tagMCI_GETDEVCAPS_PARMS.dwItem$VH;
    }
    public static int dwItem$get(MemorySegment seg) {
        return (int)tagMCI_GETDEVCAPS_PARMS.dwItem$VH.get(seg);
    }
    public static void dwItem$set( MemorySegment seg, int x) {
        tagMCI_GETDEVCAPS_PARMS.dwItem$VH.set(seg, x);
    }
    public static int dwItem$get(MemorySegment seg, long index) {
        return (int)tagMCI_GETDEVCAPS_PARMS.dwItem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwItem$set(MemorySegment seg, long index, int x) {
        tagMCI_GETDEVCAPS_PARMS.dwItem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}



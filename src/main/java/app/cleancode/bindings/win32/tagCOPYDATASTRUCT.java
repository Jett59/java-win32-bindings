// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagCOPYDATASTRUCT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwData"),
        Constants$root.C_LONG$LAYOUT.withName("cbData"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpData")
    ).withName("tagCOPYDATASTRUCT");
    public static MemoryLayout $LAYOUT() {
        return tagCOPYDATASTRUCT.$struct$LAYOUT;
    }
    static final VarHandle dwData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwData"));
    public static VarHandle dwData$VH() {
        return tagCOPYDATASTRUCT.dwData$VH;
    }
    public static long dwData$get(MemorySegment seg) {
        return (long)tagCOPYDATASTRUCT.dwData$VH.get(seg);
    }
    public static void dwData$set( MemorySegment seg, long x) {
        tagCOPYDATASTRUCT.dwData$VH.set(seg, x);
    }
    public static long dwData$get(MemorySegment seg, long index) {
        return (long)tagCOPYDATASTRUCT.dwData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwData$set(MemorySegment seg, long index, long x) {
        tagCOPYDATASTRUCT.dwData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return tagCOPYDATASTRUCT.cbData$VH;
    }
    public static int cbData$get(MemorySegment seg) {
        return (int)tagCOPYDATASTRUCT.cbData$VH.get(seg);
    }
    public static void cbData$set( MemorySegment seg, int x) {
        tagCOPYDATASTRUCT.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)tagCOPYDATASTRUCT.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        tagCOPYDATASTRUCT.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpData"));
    public static VarHandle lpData$VH() {
        return tagCOPYDATASTRUCT.lpData$VH;
    }
    public static MemoryAddress lpData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCOPYDATASTRUCT.lpData$VH.get(seg);
    }
    public static void lpData$set( MemorySegment seg, MemoryAddress x) {
        tagCOPYDATASTRUCT.lpData$VH.set(seg, x);
    }
    public static MemoryAddress lpData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCOPYDATASTRUCT.lpData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpData$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCOPYDATASTRUCT.lpData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}



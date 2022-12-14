// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagKBDLLHOOKSTRUCT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("vkCode"),
        Constants$root.C_LONG$LAYOUT.withName("scanCode"),
        Constants$root.C_LONG$LAYOUT.withName("flags"),
        Constants$root.C_LONG$LAYOUT.withName("time"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwExtraInfo")
    ).withName("tagKBDLLHOOKSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return tagKBDLLHOOKSTRUCT.$struct$LAYOUT;
    }
    static final VarHandle vkCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vkCode"));
    public static VarHandle vkCode$VH() {
        return tagKBDLLHOOKSTRUCT.vkCode$VH;
    }
    public static int vkCode$get(MemorySegment seg) {
        return (int)tagKBDLLHOOKSTRUCT.vkCode$VH.get(seg);
    }
    public static void vkCode$set( MemorySegment seg, int x) {
        tagKBDLLHOOKSTRUCT.vkCode$VH.set(seg, x);
    }
    public static int vkCode$get(MemorySegment seg, long index) {
        return (int)tagKBDLLHOOKSTRUCT.vkCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vkCode$set(MemorySegment seg, long index, int x) {
        tagKBDLLHOOKSTRUCT.vkCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle scanCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("scanCode"));
    public static VarHandle scanCode$VH() {
        return tagKBDLLHOOKSTRUCT.scanCode$VH;
    }
    public static int scanCode$get(MemorySegment seg) {
        return (int)tagKBDLLHOOKSTRUCT.scanCode$VH.get(seg);
    }
    public static void scanCode$set( MemorySegment seg, int x) {
        tagKBDLLHOOKSTRUCT.scanCode$VH.set(seg, x);
    }
    public static int scanCode$get(MemorySegment seg, long index) {
        return (int)tagKBDLLHOOKSTRUCT.scanCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void scanCode$set(MemorySegment seg, long index, int x) {
        tagKBDLLHOOKSTRUCT.scanCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return tagKBDLLHOOKSTRUCT.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)tagKBDLLHOOKSTRUCT.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        tagKBDLLHOOKSTRUCT.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)tagKBDLLHOOKSTRUCT.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        tagKBDLLHOOKSTRUCT.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return tagKBDLLHOOKSTRUCT.time$VH;
    }
    public static int time$get(MemorySegment seg) {
        return (int)tagKBDLLHOOKSTRUCT.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, int x) {
        tagKBDLLHOOKSTRUCT.time$VH.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)tagKBDLLHOOKSTRUCT.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        tagKBDLLHOOKSTRUCT.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwExtraInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwExtraInfo"));
    public static VarHandle dwExtraInfo$VH() {
        return tagKBDLLHOOKSTRUCT.dwExtraInfo$VH;
    }
    public static long dwExtraInfo$get(MemorySegment seg) {
        return (long)tagKBDLLHOOKSTRUCT.dwExtraInfo$VH.get(seg);
    }
    public static void dwExtraInfo$set( MemorySegment seg, long x) {
        tagKBDLLHOOKSTRUCT.dwExtraInfo$VH.set(seg, x);
    }
    public static long dwExtraInfo$get(MemorySegment seg, long index) {
        return (long)tagKBDLLHOOKSTRUCT.dwExtraInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwExtraInfo$set(MemorySegment seg, long index, long x) {
        tagKBDLLHOOKSTRUCT.dwExtraInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}



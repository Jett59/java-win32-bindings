// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagHIGHCONTRASTW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszDefaultScheme")
    ).withName("tagHIGHCONTRASTW");
    public static MemoryLayout $LAYOUT() {
        return tagHIGHCONTRASTW.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagHIGHCONTRASTW.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagHIGHCONTRASTW.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagHIGHCONTRASTW.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagHIGHCONTRASTW.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagHIGHCONTRASTW.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagHIGHCONTRASTW.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagHIGHCONTRASTW.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagHIGHCONTRASTW.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagHIGHCONTRASTW.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagHIGHCONTRASTW.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszDefaultScheme$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszDefaultScheme"));
    public static VarHandle lpszDefaultScheme$VH() {
        return tagHIGHCONTRASTW.lpszDefaultScheme$VH;
    }
    public static MemoryAddress lpszDefaultScheme$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagHIGHCONTRASTW.lpszDefaultScheme$VH.get(seg);
    }
    public static void lpszDefaultScheme$set( MemorySegment seg, MemoryAddress x) {
        tagHIGHCONTRASTW.lpszDefaultScheme$VH.set(seg, x);
    }
    public static MemoryAddress lpszDefaultScheme$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagHIGHCONTRASTW.lpszDefaultScheme$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszDefaultScheme$set(MemorySegment seg, long index, MemoryAddress x) {
        tagHIGHCONTRASTW.lpszDefaultScheme$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}



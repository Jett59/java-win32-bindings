// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagWNDCLASSA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("style"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnWndProc"),
        Constants$root.C_LONG$LAYOUT.withName("cbClsExtra"),
        Constants$root.C_LONG$LAYOUT.withName("cbWndExtra"),
        Constants$root.C_POINTER$LAYOUT.withName("hInstance"),
        Constants$root.C_POINTER$LAYOUT.withName("hIcon"),
        Constants$root.C_POINTER$LAYOUT.withName("hCursor"),
        Constants$root.C_POINTER$LAYOUT.withName("hbrBackground"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszMenuName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszClassName")
    ).withName("tagWNDCLASSA");
    public static MemoryLayout $LAYOUT() {
        return tagWNDCLASSA.$struct$LAYOUT;
    }
    static final VarHandle style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("style"));
    public static VarHandle style$VH() {
        return tagWNDCLASSA.style$VH;
    }
    public static int style$get(MemorySegment seg) {
        return (int)tagWNDCLASSA.style$VH.get(seg);
    }
    public static void style$set( MemorySegment seg, int x) {
        tagWNDCLASSA.style$VH.set(seg, x);
    }
    public static int style$get(MemorySegment seg, long index) {
        return (int)tagWNDCLASSA.style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void style$set(MemorySegment seg, long index, int x) {
        tagWNDCLASSA.style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnWndProc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnWndProc"));
    public static VarHandle lpfnWndProc$VH() {
        return tagWNDCLASSA.lpfnWndProc$VH;
    }
    public static MemoryAddress lpfnWndProc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSA.lpfnWndProc$VH.get(seg);
    }
    public static void lpfnWndProc$set( MemorySegment seg, MemoryAddress x) {
        tagWNDCLASSA.lpfnWndProc$VH.set(seg, x);
    }
    public static MemoryAddress lpfnWndProc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSA.lpfnWndProc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnWndProc$set(MemorySegment seg, long index, MemoryAddress x) {
        tagWNDCLASSA.lpfnWndProc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static WNDPROC lpfnWndProc (MemorySegment segment, MemorySession session) {
        return WNDPROC.ofAddress(lpfnWndProc$get(segment), session);
    }
    static final VarHandle cbClsExtra$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbClsExtra"));
    public static VarHandle cbClsExtra$VH() {
        return tagWNDCLASSA.cbClsExtra$VH;
    }
    public static int cbClsExtra$get(MemorySegment seg) {
        return (int)tagWNDCLASSA.cbClsExtra$VH.get(seg);
    }
    public static void cbClsExtra$set( MemorySegment seg, int x) {
        tagWNDCLASSA.cbClsExtra$VH.set(seg, x);
    }
    public static int cbClsExtra$get(MemorySegment seg, long index) {
        return (int)tagWNDCLASSA.cbClsExtra$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbClsExtra$set(MemorySegment seg, long index, int x) {
        tagWNDCLASSA.cbClsExtra$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbWndExtra$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbWndExtra"));
    public static VarHandle cbWndExtra$VH() {
        return tagWNDCLASSA.cbWndExtra$VH;
    }
    public static int cbWndExtra$get(MemorySegment seg) {
        return (int)tagWNDCLASSA.cbWndExtra$VH.get(seg);
    }
    public static void cbWndExtra$set( MemorySegment seg, int x) {
        tagWNDCLASSA.cbWndExtra$VH.set(seg, x);
    }
    public static int cbWndExtra$get(MemorySegment seg, long index) {
        return (int)tagWNDCLASSA.cbWndExtra$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbWndExtra$set(MemorySegment seg, long index, int x) {
        tagWNDCLASSA.cbWndExtra$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    public static VarHandle hInstance$VH() {
        return tagWNDCLASSA.hInstance$VH;
    }
    public static MemoryAddress hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSA.hInstance$VH.get(seg);
    }
    public static void hInstance$set( MemorySegment seg, MemoryAddress x) {
        tagWNDCLASSA.hInstance$VH.set(seg, x);
    }
    public static MemoryAddress hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSA.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemoryAddress x) {
        tagWNDCLASSA.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hIcon"));
    public static VarHandle hIcon$VH() {
        return tagWNDCLASSA.hIcon$VH;
    }
    public static MemoryAddress hIcon$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSA.hIcon$VH.get(seg);
    }
    public static void hIcon$set( MemorySegment seg, MemoryAddress x) {
        tagWNDCLASSA.hIcon$VH.set(seg, x);
    }
    public static MemoryAddress hIcon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSA.hIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hIcon$set(MemorySegment seg, long index, MemoryAddress x) {
        tagWNDCLASSA.hIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCursor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCursor"));
    public static VarHandle hCursor$VH() {
        return tagWNDCLASSA.hCursor$VH;
    }
    public static MemoryAddress hCursor$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSA.hCursor$VH.get(seg);
    }
    public static void hCursor$set( MemorySegment seg, MemoryAddress x) {
        tagWNDCLASSA.hCursor$VH.set(seg, x);
    }
    public static MemoryAddress hCursor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSA.hCursor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCursor$set(MemorySegment seg, long index, MemoryAddress x) {
        tagWNDCLASSA.hCursor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbrBackground$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hbrBackground"));
    public static VarHandle hbrBackground$VH() {
        return tagWNDCLASSA.hbrBackground$VH;
    }
    public static MemoryAddress hbrBackground$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSA.hbrBackground$VH.get(seg);
    }
    public static void hbrBackground$set( MemorySegment seg, MemoryAddress x) {
        tagWNDCLASSA.hbrBackground$VH.set(seg, x);
    }
    public static MemoryAddress hbrBackground$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSA.hbrBackground$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbrBackground$set(MemorySegment seg, long index, MemoryAddress x) {
        tagWNDCLASSA.hbrBackground$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszMenuName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszMenuName"));
    public static VarHandle lpszMenuName$VH() {
        return tagWNDCLASSA.lpszMenuName$VH;
    }
    public static MemoryAddress lpszMenuName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSA.lpszMenuName$VH.get(seg);
    }
    public static void lpszMenuName$set( MemorySegment seg, MemoryAddress x) {
        tagWNDCLASSA.lpszMenuName$VH.set(seg, x);
    }
    public static MemoryAddress lpszMenuName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSA.lpszMenuName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszMenuName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagWNDCLASSA.lpszMenuName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszClassName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszClassName"));
    public static VarHandle lpszClassName$VH() {
        return tagWNDCLASSA.lpszClassName$VH;
    }
    public static MemoryAddress lpszClassName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSA.lpszClassName$VH.get(seg);
    }
    public static void lpszClassName$set( MemorySegment seg, MemoryAddress x) {
        tagWNDCLASSA.lpszClassName$VH.set(seg, x);
    }
    public static MemoryAddress lpszClassName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSA.lpszClassName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszClassName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagWNDCLASSA.lpszClassName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}



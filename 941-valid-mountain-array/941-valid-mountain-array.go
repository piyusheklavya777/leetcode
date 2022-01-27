func validMountainArray(arr []int) bool {
    
    if len(arr) < 3 {
        return false
    }
    
    seenPeak := false
    
    for i := 1; i < len(arr) - 1; i++ {
        
        last, now, next := arr[i-1], arr[i], arr[i+1]
        
        if last == now || now == next || last > now && now < next {
            return false
        }
        
        if last < now && now > next {
            if seenPeak {
                return false
            }
            seenPeak = true
        }
        
        if last < now && now < next {
            if seenPeak {
                return false
            }
        }
        
        if last > now && now > next {
            if !seenPeak {
                return false
            }
        }
        
    }
    
    return seenPeak
    
}
//
//  GasImage.swift
//  GasTrack
//
//  Created by Michael Liu on 2022-12-23.
//

import SwiftUI

struct GasImage: View {
    var body: some View {
        Image("gas")
            .clipShape(Circle())
            .overlay {
                Circle().stroke(.black, lineWidth: 4)
            }
            .shadow(radius: 7)
            
    }
}

struct GasImage_Previews: PreviewProvider {
    static var previews: some View {
        GasImage()
    }
}

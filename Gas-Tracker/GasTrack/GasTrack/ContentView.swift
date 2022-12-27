//
//  ContentView.swift
//  GasTrack
//
//  Created by Michael Liu on 2022-12-23.
//

import SwiftUI
import Charts
import Foundation

struct ContentView: View {
    @State private var text1 = ""
    @State private var text2 = ""
    @State private var text3 = ""
    @State private var currentDay: Int = 0
    @State private var list: [gasList] = []
    
    //object containing day and prices for list
    struct gasList {
        let id = UUID()
        let date: Int
        let ppl: Double
        
        init(day: Int, ppl: Double) {
            self.date = day
            self.ppl = ppl
        }
    }
    
    var body: some View {
        ScrollView {
            VStack {
                //background
                GreenBackground()
                
                //title pic
                GasImage()
                    .offset(y:-50)
                    .padding(.bottom, -80)
                
                //layout of textfields
                Text("Gas Tracker")
                    .font(.largeTitle)
                    .fontWeight(.bold)
                    .foregroundColor(Color.green)
                    .padding()
                
                VStack {
                    HStack {
                        Text("Litre(s):      ")
                        TextField(" 0", text: $text1)
                            .textInputAutocapitalization(.never)
                            .disableAutocorrection(true)
                            .keyboardType(.decimalPad)
                            .frame(width: 100.0)
                            .border(.secondary)
                    }
                    .padding()
                    
                    HStack {
                        Text("Price/Litre: ")
                        TextField(" 000.0", text: $text2)
                            .frame(width: 100.0)
                            .textInputAutocapitalization(.never)
                            .disableAutocorrection(true)
                            .keyboardType(.decimalPad)
                            .border(.secondary)
                    }
                    .padding()
                    
                    HStack {
                        Text("Total:          ")
                        TextField(" $0.00", text: $text3)
                            .frame(width: 100.0)
                            .border(.secondary)
                    }
                    .padding()
                    
                    Button(action: {
                        let num1 = Double(self.text1) ?? 0
                        let num2 = (Double(self.text2) ?? 0) / 100
                        self.text3 = "$" + String(format : "%.2f", num1*num2)
                        
                        //if you want to cap the amount created in the list
                        /*if(currentDay > 10) {
                            self.list.removeAll()
                            self.currentDay = 0;
                        }
                        else {
                            self.list.append(gasList(day: self.currentDay, ppl: num2*100))
                            self.currentDay += 1
                        }*/
                        
                        //if you don't a cap on the list
                        self.list.append(gasList(day: self.currentDay, ppl: num2*100))
                        self.currentDay += 1
                    }) {
                        Text("Calculate")
                    }
                    .padding(.leading)
                    
                    Divider()
                        .padding()
                    
                    //Graph that displays price of gas over time
                    VStack {
                        HStack {
                            Text("Line Graph")
                                .font(.title3)
                                .fontWeight(.medium)
                            
                            Spacer()
                            
                            Text("Within the last 30 price checks.")
                                .font(.subheadline)
                                .foregroundColor(.secondary)
                        }
                        Chart {
                            ForEach(list, id: \.id) { item in
                                LineMark(
                                    x: .value("Date", item.date),
                                    y: .value("Price", item.ppl)
                                )
                            }
                        }
                        .padding()
                    }
                }
                .padding()
                Spacer()
                
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
